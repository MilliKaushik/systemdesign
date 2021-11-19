package lru;

public class Node<K, V> {

	K key;

	V value;

	Node prev;

	Node next;

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
