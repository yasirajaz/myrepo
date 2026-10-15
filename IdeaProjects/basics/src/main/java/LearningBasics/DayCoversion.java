package LearningBasics;

public class DayCoversion {
    public static void main(String[]arg){
        int days = 3990;
        int years = days/ 399;
        days = days % 365;
        int months = days/ 30;
        days = days % 30;

        System.out.println("Years =" + years);
        System.out.println("Months =" + months);
        System.out.println("Days =" + days);

    }
}
