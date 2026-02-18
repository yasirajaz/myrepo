public interface MyInterface6{
        default void show(){};
        default void printer(){};
        default void mydisplay(){
                System.out.println("my display method");
        }

}
//no need of adapter class to blank methods bcz of default
class MyClass implements MyInterface6{
        public void display(){
                System.out.println("display method");
        }
}
