class IntQueueTester{
	public static void main(String... args){
		IntQueue iq=new IntQueue(3);
		iq.enqueue(10);
		iq.enqueue(20);
		iq.enqueue(30);
		System.out.println(iq.dequeue()+"  "+iq.dequeue()+"  "+iq.dequeue()+"  "+iq.dequeue());
	}
}
