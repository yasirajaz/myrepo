import java.util.Hashtable;
class TableHashDemo{
	public static void main(String... args){
		Hashtable<String,String> ht=new Hashtable<>();
		ht.put("name","zaid khan");
		ht.put("age","55");
		ht.put("city","lucknow");
		String a=ht.get("name");
		String n=ht.get("age");
		System.out.println(a+"  "+n);
	}
}
