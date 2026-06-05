import java.util.Vector;
class DynamicArrayDemo{
	public static void main(String... args){
		Vector<Object> name=new Vector<>(5);
		name.add("yasir ajaz");
		name.add("zaid khan");
		name.add("arsh khan");
		System.out.println(name.get(1));
		name.add(3);
		name.add("arsh khan");
		name.add(5);
		System.out.println(name.get(2));
		System.out.println(name.capacity());
		System.out.println(name.size());
	}
}
