import java.util.Scanner;

public class Exercise3 {
    //get Fibonacci sequence
    static int fibonacci(int n) {
        //if condition to return the start of the series, if 0 or 1 is entered
        if(n<=1)
            return n;
        //return the number
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("n-th Fibonacci number is: " + fibonacci(n));
    }

}
