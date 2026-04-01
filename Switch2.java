import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
       // Write a program to Check whether a character is a vowel or consonant using switch statement //
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the alphabet in caps:");
       char alp = input.next().charAt(0);
       switch (alp) {
        case 'A':
            System.out.println("It's a vowel");
            break;
        case 'E':
            System.out.println("It's a vowel");
            break;
        case 'I':
            System.out.println("It's a vowel");
            break;
        case 'O':
            System.out.println("It's a vowel");
            break;
        case 'U':
            System.out.println("It's a vowel");
            break;
        default:
            System.out.println("It's a consonent");
            break;
       }
    }
}
