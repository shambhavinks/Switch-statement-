import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        
        //Write a program to read gender(M/F) and print the corresponding gender using a switch statement//
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the gender:");
        char gender = input.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("It's a male");
                 break;
            case 'F':
                System.out.println("It's a female");
                break;
        
            default:
                System.out.println("Enter the valid gender");
                break;
        }



    }
}