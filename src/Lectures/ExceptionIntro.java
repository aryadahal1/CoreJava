package Lectures;

public class ExceptionIntro { //try, catch, finally, throws, throw
    public static void main(String[] args) {
        int n = 100;
        int result;

        try {
            result = n / 0;
        } catch (Exception ex){
            System.out.println("number cant be divided");
        }
        System.out.println("result not found ============ ");
    }
}
