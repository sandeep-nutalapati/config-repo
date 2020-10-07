package com.sample;

public class CompassDirection {

	public static void main(String[] args) {

		Node head = new Node("E");
		createDirectionList(head);

		findDirection(3, 2, head);

	}

	private static void findDirection(int left, int right, Node head) {
		Node current = head;
		left = left % 4;
		right = right % 4;

		int leftRot = left > right ? left - right : 0;
		int rightRot = right > left ? right - left : 0;

		for (int i = 0; i < leftRot; i++) {
			current = current.left;
		}
		for (int i = 0; i < rightRot; i++) {
			current = current.right;
		}
		System.out.println(current.direction);
	}

	private static void createDirectionList(Node east) {
		Node north = new Node("N");
		Node west = new Node("W");
		Node south = new Node("S");
		east.left = north;
		north.left = west;
		north.right = east;
		west.left = south;
		west.right = north;
		south.left = east;
		south.right = west;
		east.right = south;

	}

}

class Node {
	String direction;
	Node left;
	Node right;

	public Node(String direction) {
		super();
		this.direction = direction;
	}
}
