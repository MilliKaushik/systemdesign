package cache.eviction;

import cache.algorithm.DoublyLinkedList;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

	private DoublyLinkedList<Key> list;

	public LRUEvictionPolicy() {
		list = new DoublyLinkedList<>();
	}

	@Override
	public void keyAccessed(Key key) {

	}

}
