import java.util.*;
class TesterBST{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		BST bs=new BST();
		System.out.println("Enter the number of nodes: ");
		bs.createTree(sc.nextInt());
		System.out.println("Traversal....");
		bs.display(bs.root);
		System.out.println("pre order traversal...");
		bs.preOrder(bs.root);
		System.out.println("post order traversal...");
		bs.postOrder(bs.root);
		//System.out.println("post order2 traversal...");
                //bs.postOrder2(bs.root);
		System.out.println("In order traversal...");
		bs.inOrder(bs.root);
		System.out.println("searching for the data");
		bs.search(bs.root,5);
	}
}
