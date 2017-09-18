package com.operr.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
	private int value;
	private Node beforeLink;
	private Node afterLink;

	public Node(int val) {
		this.value = val;
	}
}
