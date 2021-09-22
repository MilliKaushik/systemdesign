package cache.algorithm;

import java.util.LinkedList;
import java.util.List;

import cache.exception.ElementNotPresentInListException;

public class DoublyLinkedList<Key> {

	private DoublyLinkedListNode<Key> head;

	private DoublyLinkedListNode<Key> tail;

	public void removeFromLast(DoublyLinkedListNode<Key> node) throws ElementNotPresentInListException {
		if (!dll.contains(node))
			throw new ElementNotPresentInListException("Elelment is not present in the list");
		node.

				dll.remove(node);
	}

	public void addToFirst(DoublyLinkedListNode<Key> node) {
		if (head == null) {
			head = node;
			return;
		}
		node.setNext(head);
		head.setPrev(node);
		head = node;
	}

}
