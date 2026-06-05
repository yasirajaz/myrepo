import java.util.*;
class TraversingMap{
	public static void main(String... args){
		Map<String,String> mp=new HashMap<>();
		mp.put("name","yasir");
		mp.put("age","twenty");
		Set<String> st=mp.keySet();
		for(String key: st){
			System.out.println(key+"  "+mp.get(key));
		}
	}
}
