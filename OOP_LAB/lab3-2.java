import java.util.*;

class Main
{
	static class Node
    {
		public int data;
		public Node nextNode;

		public Node(int data)
        {
			this.data = data;
		}
	}

	static Node GetNode(int data)
	{
		return new Node(data);
	}

	static Node InsertPos(Node headNode, int position, int data)
	{
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		if (position == 1)
		{
			Node newNode = new Node(data);
			newNode.nextNode = headNode;
			head = newNode;
		}
		else
		{
			while (position-- != 0)
			{
				if (position == 1)
				{
					Node newNode = GetNode(data);

					newNode.nextNode = headNode.nextNode;

					headNode.nextNode = newNode;
					break;
				}
				headNode = headNode.nextNode;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	static void PrintList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data);
			node = node.nextNode;
			if (node != null)
				System.out.print(", ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Node head = GetNode(3);
		head.nextNode = GetNode(5);
		head.nextNode.nextNode = GetNode(8);
		head.nextNode.nextNode.nextNode = GetNode(10);

		

		int data, pos;
		System.out.print("where do you want to insert the data: ");
		pos = sc.nextInt();
		System.out.print("Data to insert: ");
		data = sc.nextInt();
		
		sc.close();
		System.out.print("Linked list: ");
		PrintList(head);
		
		head = InsertPos(head, pos, data);
		System.out.print("updated linked list after inserting "+ data + " at position " + pos + ": ");
		PrintList(head);
	}
}

