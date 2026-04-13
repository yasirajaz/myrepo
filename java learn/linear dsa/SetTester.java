import java.util.Set;
import java.util.HashSet;
class SetTester{
	public static void main(String[] args){
		Set<String> st=new HashSet<>();
		st.add("yasir");
		st.add("amir");
		st.add("zaid");
		System.out.println(st);
		System.out.println(st.size());
		st.add("zaid");
		System.out.println(st.size());
	}
}
