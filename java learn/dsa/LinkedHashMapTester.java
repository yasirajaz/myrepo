import java.util.*;
class LinkedHashMapTester{
        public static void main(String... args){
                Map<String,String> person=new LinkedHashMap<>();
                person.put("name","yasir");
                person.put("city","lucknow");
                person.put("country","India");
                Set<String> k=person.keySet();
                for(String s: k){
                        System.out.println(s+"  "+person.get(s));
                }
                Collection<String> v=person.values();
                Iterator<String> it=v.iterator();
                while(it.hasNext()){
                        System.out.println(it.next());
                }
//		person.removeEldestEntry();
                // another way to traverse map
		for(Map.Entry<String,String> entry:person.entrySet()){
                        System.out.println(entry.getKey()+"  "+entry.getValue());
                }
        }
}

