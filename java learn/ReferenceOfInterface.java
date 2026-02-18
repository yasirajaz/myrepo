public interface ReferenceOfInterface{
        void m5();
}
class MyClass implements ReferenceOfInterface{
	public void m5(){
                System.out.println("m5 method");
        }
        public void m6(){  //ye dusra mrthod h mydisplay k naam s na ki static ko verride kia h
                System.out.println("m6 method");
        }
}
