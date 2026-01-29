import java.util.*;
class fourpowern{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                System.out.print("enter the num you want to check for four power n:");
                int n= sc.nextInt();
                if((n &(n-1))==0 && n%3==1){
                        System.out.println("the number is four power n");
                }else{
                        System.out.println("the number is not four power n");
                }
        }
}
