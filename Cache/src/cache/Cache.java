package cache;

import cache.eviction.EvictionPolicy;
import cache.exception.KeyNotFoundException;
import cache.exception.StorageFullException;
import cache.storage.Storage;

public class Cache<Key, Value> {

	private final Storage<Key, Value> storage;

	private final EvictionPolicy<Key> evictionPolicy;

	public Cache(Storage<Key, Value> storage, EvictionPolicy<Key> evictionPolicy) {
		this.storage = storage;
		this.evictionPolicy = evictionPolicy;
	}

	public void put(Key key, Value value) {
		try {
			storage.add(key, value);
			evictionPolicy.keyAccessed(key);
		} catch (StorageFullException e) {
			System.out.println(e.getMessage());
			Key keyToRemove = evictionPolicy.evictKey();
			if (keyToRemove == null)
				throw new RuntimeException("No key to evict");
			try {
				storage.remove(keyToRemove);
			} catch (KeyNotFoundException e1) {
				e1.printStackTrace();
			}
			put(key, value);
		}
	}

	public Value get(Key key) {
		Value value = null;
		try {
			value = storage.get(key);
			evictionPolicy.keyAccessed(key);
			return value;
		} catch (KeyNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
}
