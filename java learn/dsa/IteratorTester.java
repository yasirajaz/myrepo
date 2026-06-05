import java.util.*;
class IteratorTester{
	public static void main(String... args){
		List<String> name=new ArrayList<>();
		name.add("lucknow");
		name.add("kanpur");
		name.add("barabanki");
		Iterator<String> it= name.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
