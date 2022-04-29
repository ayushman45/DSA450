package linkedlist;

import java.util.*;

public class Q01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head;
		int counter=1;
		Node p=new Node();
		p.next=null;
		Node q;
		head=p;
		System.out.println("Enter 1 to add node : ");
		counter=sc.nextInt();
		while(counter==1) {
			q=new Node();
			q.next=null;
			p.next=q;
			p=q;
			System.out.println("Enter 1 to add node : ");
			counter=sc.nextInt();
		}
		head.traverse();
		
		head=reverse(head);
		System.out.println();
		head.traverse();
	}

	private static Node reverse(Node head) {
		// TODO Auto-generated method stub
		
		Node prev=head;
		Node curr=prev.next;
		head.next=null;
		while(curr!=null) {
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}

}
