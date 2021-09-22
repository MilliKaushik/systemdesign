package cache.algorithm;

public class DoublyLinkedListNode<K> {

	private K key;

	private DoublyLinkedListNode<K> prev;

	private DoublyLinkedListNode<K> next;

	public DoublyLinkedListNode(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public DoublyLinkedListNode<K> getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedListNode<K> prev) {
		this.prev = prev;
	}

	public DoublyLinkedListNode<K> getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode<K> next) {
		this.next = next;
	}

}
