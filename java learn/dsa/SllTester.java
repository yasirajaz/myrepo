import java.util.Scanner;
class SllTester{
	public static void main(String... args){
		SinglyLinkedList sl=new SinglyLinkedList();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number of nodes: ");
		int x= sc.nextInt();
		sl.createList(x);
		sl.traverse(sl.head);
	}
}
