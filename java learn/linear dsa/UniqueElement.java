import java.util.Set;
import java.util.HashSet;
class UniqueElement{
	public static void main(String... args){
		int[] arr={5,5,55,5,55,6,66,6,6,6,66,666,666,5555,5555,5555};
		Set<Integer> st=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			st.add(arr[i]);
		}
		System.out.println(st.size());
	}
}
