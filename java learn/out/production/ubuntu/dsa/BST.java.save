import java.util.*;
class BST{
	private class Node{
		int data;
		Node left;
		Node right;
		Node(int x){
			data=x;
			left=null;
			right=null;
		}
	}
	public Node root;
	public BST(){
		root=null;
	}
	public void createTree(int no_of_nodes){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<no_of_nodes;i++){
			System.out.println("Enter the data: ");
			Node temp=new Node(sc.nextInt());
			if(root==null) root=temp;
			else{
				Node p=root,q=root;
				while(p!=null){
					q=p;
					if(temp.data>p.data)
						p=p.right;
					else p=p.left;
				}
				if(q.data<temp.data) q.right=temp;
				else q.left=temp;
			}
		}
	}
	public void display(Node root){
		if(root==null) return;
		Queue<Node> queue=new LinkedList<>();
		queue.offer(root);
		while(queue.peek()!=null){
			int size=queue.size();
			for(int i=0;i<size;i++){
				Node node=queue.poll();
				System.out.print(node.data+"  ");
				if(node.left!=null) queue.offer(node.left);
				if(node.right!=null) queue.offer(node.right);
			}
			System.out.println();
		}
	}
	public void preOrder(Node root){
		Stack<Node> st=new Stack<>();
		List<Node> arr=new ArrayList<>();
		st.push(root);
		while(!st.empty()){
			Node p=st.pop();
			arr.add(p);
			if(p.right!=null){
				st.push(p.right);
			}
			if(p.left!=null) st.push(p.left);
		}
		for(Node n: arr)
			System.out.print(n.data+"  ");
		System.out.println();
	}
	/*public void inOrder(Node root){
                Stack<Node> st=new Stack<>();
                List<Node> arr=new ArrayList<>();
                if(root.left);
                while(!st.empty()){
                        Node p=st.pop();
                        arr.add(p);
                        if(p.right!=null){
                                st.push(p.right);
                        }
                        if(p.left!=null) st.push(p.left);
                }
                for(Node n: arr)
                        System.out.print(n.data+"  ");
        }*/
	public void postOrder(Node root){
                Stack<Node> st=new Stack<>();
                Stack<Node> stt=new Stack<>();
                st.push(root);
                while(!st.empty()){
			Node p=st.pop();
			stt.push(p);
                        if(p.left!=null) st.push(p.left);
			if(p.right!=null) st.push(p.right);
                }
                while(!stt.empty()){
			System.out.print(stt.pop().data+" ");
		}
		System.out.println();
	}
	/*public void postOrder2(Node root){
		Stack<Node> st=new Stack<>();
		List<Node> arr=new ArrayList<>();
		st.push(root);
		while(!st.empty()){
			Node p=root;
			if(st.peek().right!=null || st.peek().left!=null){
				if(p.right!=null) st.push(p.right);
				if(p.left!=null) st.push(p.left);
			}
			arr.add(st.pop());
		}
		for(Node s: arr) System.out.println(s.data+"   ");
		System.out.println();
	}*/
	public void inOrder(Node root){
		Stack<Node> st=new Stack<>();
		Node p=root;
		while(p!=null|| !st.empty()){
			while(p!=null){
				st.push(p);
				p=p.left;
			}
			p=st.pop();
			System.out.print(p.data+"   ");
			p=p.right;
		}
		System.out.println();
	}
	Node search(Node root,int data){
		Node temp=root;
		while(temp!=null){
			if(temp.data==data){
				System.out.println(temp.data);
				return temp;
			}else if(temp.data<data) temp=temp.right;
			else temp=temp.left;
		}
		System.out.println("Not found");
		return null;
	}
}
