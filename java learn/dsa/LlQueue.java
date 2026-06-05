class LlQueue{
	class Node{
		int data;
                Node next;
                Node(int x){
                        data=x;
                        next=null;
                }
        }
        private Node rear;
	private Node front;
        public LlQueue(){
                rear=null;
		front=null;
        }
	public void enqueue(int data){
		Node temp=new Node(data);
		if(rear==null) {
			front=temp;
			rear=temp;
		//	return;
		}
		rear.next=temp;
		rear=rear.next;
	}
	public int dequeue(){
		if(front == null){
			return Integer.MIN_VALUE;
		}
		Node temp= front;
                front=front.next;
		temp.next=null;
                return temp.data;
	}
}
