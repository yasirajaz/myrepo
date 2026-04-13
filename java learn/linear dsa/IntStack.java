class IntStack{
	private int[] stack;
	private int top;
	public IntStack(int n){
		stack=new int[n];
		top=-1;
	}
	public void push(int data){
		if(top==stack.length-1){
			System.out.println("stack overflow");
		}else{
			stack[++top]=data;
		}
	}
	public int pop(){
		if(top==-1){
			return Integer.MIN_VALUE;
		}else{
			return stack[top--];
		}
	}
	public int peek(){
		if(top==-1){
			return Integer.MIN_VALUE;
		}
		return stack[top];
	}
	public int size(){
		return top+1;
	}
}
