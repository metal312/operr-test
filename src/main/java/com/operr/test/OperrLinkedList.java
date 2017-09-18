package com.operr.test;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OperrLinkedList {
	private Node start;
	private Node end;

	/**
	 * Push an element at the begining of the list
	 *
	 * @param val
	 *            the value of the element
	 */
	public void push(int val) {
		Node tmpNode = new Node(val);
		if (start == null) {
			start = tmpNode;
			end = start;
		} else {
			tmpNode.setAfterLink(start);
			start.setBeforeLink(tmpNode);
			start = tmpNode;
		}
	}

	/**
	 * Pop the last element of the list.
	 *
	 * @return the last element
	 */
	public int pop() {
		if (end != null) {
			Node tmp = end;
			end = end.getBeforeLink();
			return tmp.getValue();
		} else {
			throw new RuntimeException("No item found in the linkedlist");
		}
	}

	/**
	 * Remove a node
	 *
	 * @param node
	 *            node to remove
	 */
	public void removeNode(Node node) {
		Node beforeNode = node.getBeforeLink();
		Node afterNode = node.getAfterLink();
		beforeNode.setAfterLink(afterNode);
		afterNode.setBeforeLink(beforeNode);
	}

	/**
	 * Remove all element that is greater than {@code val}
	 *
	 * @param val
	 *            threshold value.
	 */
	public void removeIfLargerThan(int val) {
		Node node = start;

		while (node != end) {
			if (node != null && node.getValue() > val) {
				removeNode(node);
			}
			node = node.getAfterLink();
		}

		if (end != null && end.getValue() > val) {
			end = end.getBeforeLink();
		}
	}
}
