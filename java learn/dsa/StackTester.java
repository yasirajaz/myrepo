import java.util.Stack;
class StackTester{
	public static void main(String[] args){
		Stack<Object> ss=new Stack<>();
		ss.push(5);
		ss.push(5);
		ss.push(6);
		//Stack<String> ss=new Stack<>();
		ss.push("lucknow");
		while(!ss.empty()){
			System.out.println(ss.pop());
		}
	}
}
