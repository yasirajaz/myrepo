import java.util.Scanner;
class DCLL{
	private class Node{
		int data;
		Node prev;
		Node next;
		Node(int x){
			data=x;
			prev=this;
			next=this;
		}
	}
	private Node head;
	public DCLL(){
		head=null;
	}
	void create(int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("enter the node: ");
			Node temp=new Node(sc.nextInt());
			if(head==null){
				head=temp;
			}else{
				Node p=head;
				while(p.next !=head){
					p=p.next;
				}
				p.next=temp;
				temp.prev=p;
				temp.next=head;
				head.prev=temp;
			}
		}
	}
	void traverse(){
		Node temp=head;
		while(temp.next!=head){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
		System.out.println(temp.next.data);
		while(temp!=head){
			System.out.print(temp.data+"<--");
			temp=temp.prev;
		}
		System.out.println(temp.data);
		
	}
	void insert(int data,int pos){
		Node temp=new Node(data);
		Node p=head;
		Node q=head;
		if(pos==1){
			if(head==null)
			head=temp;
			else{
				temp.next=head;
				temp.prev=head.prev;
				head.prev.next=temp;
				head.prev=temp;
				head=temp;
			}
		}else{
			int count=1;
			while(count<pos&& q.next!=head){
				p=q;
				q=q.next;
				count++;
			}
			p.next=temp;
			temp.prev=p;
			temp.next=q;
			q.prev=temp;
		}

	}
	void delete(int pos){
		if(pos==1){
			if(head.next==head) head=null;
			Node t=head.prev;
			head=head.next;
			head.prev=t;
			t.next=head;
			return;
		}
		Node temp=head;
		for(int i=1;i<pos;i++){
			temp=temp.next;
			if (temp.next==head) return;
		}
		Node p=temp.prev;
		Node q=temp.next;
		p.next=q;
		q.prev=p;
	}
}

