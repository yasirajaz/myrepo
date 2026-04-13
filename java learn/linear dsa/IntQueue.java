class IntQueue{
	private int[] queue;
        private int rear;
	private int front;
        public IntQueue(int n){
                queue=new int[n];
                front=-1;
		rear=-1;
        }
	public void enqueue(int data){
		if(rear==queue.length-1) System.out.println("queue is full");
		else{
			queue[++rear]=data;
			if(front=-1) front=0;
		}
	}
	public int dequeue(){
		if((rear==-1 && front==-1)||front>rear) return Integer.MIN_VALUE;
		int data=queue[front++];
		return data;
	}
}
