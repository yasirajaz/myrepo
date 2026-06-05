import java.util.*;
class QueueTester{
	public static void main(String... args){
		Queue<String> qu=new LinkedList<>();
		qu.offer("yasir");
		qu.offer("amir");
		qu.offer("zaid");
		while(qu.peek()!=null){
			System.out.println(qu.poll());
		}
	}
}
