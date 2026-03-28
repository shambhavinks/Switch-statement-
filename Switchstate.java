import java.util.Scanner;

public class Switchstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        if(fruit.equals("Mango")){
            System.out.println("King of fruit");
        }
        if(fruit.equals("Apple")){
            System.out.println("A red sweet fruit");
        }
    }
}
