import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        //Print the weekday and weekend in a week//
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int days = input.nextInt();
        switch (days) {
           case 1,2,3,4,5 -> System.out.println("Weekday");
           case 6,7 -> System.out.println("Weekend");
        }
    }
}
