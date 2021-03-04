package Assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number: ");

        try{
            int num = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Not a lucky number");
            continue;
        }
        System.out.println("you got a lucky number");


    }
}
