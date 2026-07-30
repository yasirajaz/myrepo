package AlgosW;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class AlgosWrapper {
    public Algos algos;

    public AlgosWrapper(Algos algos) {
        this.algos = algos;
    }
    public void caller(int[] arr) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Enter for Sorting");
            System.out.println("2. Enter for Searching");
            System.out.print("Enter your choice: ");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    algos.bubbleSort(arr);
                    System.out.println("Sorted Array: "+Arrays.toString(arr));
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    int target = sc.nextInt();
                    int result = algos.linearSearch(arr, target);
                    switch (result) {
                        case -1:
                            System.out.println("Element not found");
                            break;
                        default:
                            System.out.println("Element found at index: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}