package cache.storage;

import cache.exception.KeyNotFoundException;
import cache.exception.StorageFullException;

public interface Storage<Key, Value> {

	void add(Key key, Value value) throws StorageFullException;

	Value get(Key key) throws KeyNotFoundException;
	
	void remove(Key key) throws KeyNotFoundException;

}
