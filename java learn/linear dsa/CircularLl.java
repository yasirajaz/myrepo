import java.util.*;
class CircularLl{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	private Node head;
	public CircularLl(){
		head=null;
	}
	public void createList(int n){
		Node temp=null;
		Node t=null;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("enter the data: ");
			int x=sc.nextInt();
			temp=new Node(x);
			if(head==null){
				head=temp;
				t=temp;
			}else{
				t.next=temp;
				t=temp;
			}
			if(t !=null) t.next=head;
		}
	}
	public void display(){
		Node t=head;
		if(head==null) return;
		if(t==null) System.out.println("list is empty");
		while(true){
			System.out.print(t.data+" --> ");
			t=t.next;
			if(t==head) break;
		}
		System.out.println("back to head");
	}
	public void addNode(int data,int pos){
		Node temp=new Node(data);
		if(pos==1){
			if(head==null){
				head=temp;
			}else{
				Node p=head;
				while(p.next!=head) p=p.next;
				temp.next=head;
				head=temp;
				p.next=temp;
			}
		}else{
			Node p=head;
			int count=1;
			while((count<pos-1)&&(p.next!=head)){
				p=p.next;
				count++;
			}
			temp.next=p.next;
			p.next=temp;
		}
	}
	public void delete(int pos){
		Node p=null,t=null;
		int count=1;
		if(head==null){
			System.out.println("empty list");
		}else if(pos==1){
			p=head;
			while(p.next!=head) p=p.next;
			t=head;
			p.next=t.next;
			head=p.next;
			t.next=null;
		}else{
			p=head;
			t=head;
			while((t.next!=head)&& count<pos) {
				p=t;
				t=t.next;
				count++;
			}
			p.next=t.next;
			t.next=null;
		}
	}
}
