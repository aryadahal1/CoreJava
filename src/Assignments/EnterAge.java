package Assignments;
import java.util.Scanner;

public class EnterAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You will be " + (age+5) + " in 5 years");
    }
}
