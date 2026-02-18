public interface StaticInterface{
        default void show(){};
        default void printer(){};
        static void mydisplay(){ //ye kbhi overriden ahi hoga aur na hi object s call hoga hmesha class s call hoga
                System.out.println("my display method");
        }

}
//no need of adapter class to blank methods bcz of default
class MyClass implements StaticInterface{
        public void display(){
                System.out.println("display method");
        }
	public void mydisplay(){  //ye dusra mrthod h mydisplay k naam s na ki static ko verride kia h
                System.out.println("second mydisplay method");
        }
}
