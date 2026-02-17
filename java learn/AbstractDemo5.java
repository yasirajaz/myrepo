abstract class AbstractDemo5{
        public abstract void show();
}
class NonAbstract extends AbstractDemo5{
        public void show(){
                System.out.println("Show method");
        }
}
