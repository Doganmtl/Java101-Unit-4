import java.util.Scanner;

public class RecursivePrime {
    
    static boolean isPrime(int n, int x) {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % x == 0)
            return false;
        if (x * x > n)
        return true;

        return isPrime(n, x+1);
    }

    
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int n;

            System.out.print("Enter a number: ");
            n = input.nextInt();

            if(isPrime(n, 2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
