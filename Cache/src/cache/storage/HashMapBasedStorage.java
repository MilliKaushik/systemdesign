package cache.storage;

import java.util.HashMap;
import java.util.Map;

import cache.exception.KeyNotFoundException;
import cache.exception.StorageFullException;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {

	private Map<Key, Value> mapBasedStorage;

	private int capacity;

	public HashMapBasedStorage(int capacity) {
		this.capacity = capacity;
		mapBasedStorage = new HashMap<>();
	}

	@Override
	public void add(Key key, Value value) throws StorageFullException {
		if (mapBasedStorage.size() == capacity)
			throw new StorageFullException("Storage is full");

		mapBasedStorage.put(key, value);
	}

	@Override
	public Value get(Key key) throws KeyNotFoundException {
		Value value = mapBasedStorage.get(key);

		if (value == null)
			throw new KeyNotFoundException("Key was not found in the storage");
		return value;
	}

	@Override
	public void remove(Key key) throws KeyNotFoundException {
		Value value = mapBasedStorage.get(key);

		if (value == null)
			throw new KeyNotFoundException("Key was not found in the storage");
		mapBasedStorage.remove(key);
	}

}
