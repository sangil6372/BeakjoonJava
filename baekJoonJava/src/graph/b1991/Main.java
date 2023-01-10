package graph.b1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static Node head = new Node("A", null, null);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int V = Integer.parseInt(st.nextToken());


		while (V-- > 0) {
			st = new StringTokenizer(br.readLine());
			String now = st.nextToken();
			String left = st.nextToken();
			String right = st.nextToken();

			insertNode(head, now, left, right);
		}
		preOrder(head);
		sb.append("\n");
		inOrder(head);
		sb.append("\n");
		postOrder(head);
		
		
		
		System.out.println(sb);

	}

	public static class Node {

		String value;
		Node left;
		Node right;

		public Node(String value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}

	public static void insertNode(Node temp, String root, String left, String right) {
		if (temp.value.equals(root)) {
			temp.left = (left.equals(".") ? null : new Node(left, null, null));
			temp.right = (right.equals(".") ? null : new Node(right, null, null));

		} else {
			if (temp.left != null) {
				insertNode(temp.left, root, left, right);
			}
			if (temp.right != null) {
				insertNode(temp.right, root, left, right);
			}

		}
	}

	public static void preOrder(Node n) {
		if (n == null) {
			return;
		}
		sb.append(n.value);
		preOrder(n.left);
		preOrder(n.right);
	}

	public static void inOrder(Node n) {
		if (n == null) {
			return;
		}
		inOrder(n.left);
		sb.append(n.value);

		inOrder(n.right);
	}

	public static void postOrder(Node n) {
		if (n == null) {
			return;
		}
		postOrder(n.left);
		postOrder(n.right);
		sb.append(n.value);
	}

}
