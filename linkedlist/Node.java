package linkedlist;
import java.util.*;
public class Node {
	static Scanner sc=new Scanner(System.in);
	int data;
	Node next;
	Node prev;
	
	Node(){
		System.out.println("Enter data :");
		this.data=sc.nextInt();
		this.next=null;
		this.prev=null;
	}
	
	void traverse() {
		Node p=this;
		while(p!=null) {
			System.out.print(p.data+"  ");
			p=p.next;
		}
	}

}
