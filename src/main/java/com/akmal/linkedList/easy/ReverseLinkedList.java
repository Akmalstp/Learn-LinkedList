package com.akmal.linkedList.easy;

public class ReverseLinkedList {
	
	/**
	 * When u pass head of a linked list it uses three pointers
	 * curr, prev, temp(curr.next) to reverse a given linked list
	 * and return head of the reversed linked list
	 * @param Head(reference of head) of the linked list
	 * @return Head of the reversed linked list
	 */
	public static Node reverseLinkedList(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
}
