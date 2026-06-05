import java.util.*;
class DequeTester{
        public static void main(String... args){
                java.util.Deque<String> qu=new LinkedList<>();
                qu.offerFirst("Lucknow");
                qu.offerLast("kanpur");
                qu.offerFirst("Unnao");
                while(qu.peekFirst()!=null){
                        System.out.println(qu.pollFirst());
                }
        }
}
