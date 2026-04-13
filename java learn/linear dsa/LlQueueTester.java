class LlQueueTester{
        public static void main(String... args){
                LlQueue iq=new LlQueue();
                iq.enqueue(10);
                iq.enqueue(20);
                iq.enqueue(30);
                System.out.println(iq.dequeue()+"  "+iq.dequeue()+"  "+iq.dequeue()+"  "+iq.dequeue());
        }
}
