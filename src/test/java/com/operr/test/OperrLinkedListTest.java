package com.operr.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class OperrLinkedListTest {

	@Test
	public void testPushAndPop() {
		OperrLinkedList linkedList = new OperrLinkedList();
		linkedList.push(0);
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		assertEquals(0, linkedList.pop());
		assertEquals(1, linkedList.pop());
		assertEquals(2, linkedList.pop());
		assertEquals(3, linkedList.pop());
		assertEquals(4, linkedList.pop());
	}

	@Test
	public void testRemoveIfLargerThan() {
		OperrLinkedList linkedList = new OperrLinkedList();
		linkedList.push(5);
		linkedList.push(1);
		linkedList.push(3);
		linkedList.push(4);
		linkedList.push(2);
		linkedList.removeIfLargerThan(3);
		assertEquals(1, linkedList.pop());
		assertEquals(3, linkedList.pop());
		assertEquals(2, linkedList.pop());
	}
}
