import java.util.*;
class Doublyll{
	private class Node{
		Node prev;
		Node next;
		int data;
		Node(int x){
			data=x;
			prev=null;
			next=null;
		}
	}
	private Node head;
	public Doublyll(){
		head=null;
	}
	public void createList(int n){
		Node temp=null;
		Node t=null;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("enter the node: ");
			int x=sc.nextInt();
			temp=new Node(x);
			if(head==null){
                                head=temp;
				t=temp;
                        }else{
				t.next = temp;
				temp.prev = t;
				t=temp;
			}
		}
	}
	public void display(){
		Node t=head;
                if(t==null) System.out.println("list is empty");
                while(true){
                        System.out.print(t.data+"-->");
                        t=t.next;
                        if(t.next==null) break;
                }
		System.out.print(t.data);
		System.out.println();
                while (t!= null) {
        		System.out.print(t.data + "<--");
			t= t.prev;
        	}
		System.out.println();
	}
	public void addNode(int data,int pos){
		Node temp=new Node(data);
		if(pos==1){
			if(head==null){
				head=temp;
			}else{
				temp.next=head;
				head.prev=temp;
				head=temp;
			}
		}else{
			if(head==null){
				System.out.println("cant inseerted any node");
			}else{
				int count=1;
				Node p=head,q=head;
				while(pos >count && q!=null){
					p=q;
					q=q.next;
					count++;
				}
				temp.next=q;
				temp.prev=p;
				p.next=temp;
				if(q!=null) q.prev=temp;
			}
		}
	}
	public void delete(int pos){
		Node p;
		int count=1;
		Node q=head;
		Node t;
		if(head==null){
			System.out.println("list is empty");
		}else if(pos==1){
			p=head;
			head=p.next;
			head.prev=null;
			p.next=null;
		}else{
			while(pos-1>count && q.next!=null){
				p=q;
				q=q.next;
				count++;
			}
			t=q.next;
			q.next=t.next;
			if(t.next!=null) t.next.prev=q;
			t.next=null;
			t.prev=null;
		}
	}
}
