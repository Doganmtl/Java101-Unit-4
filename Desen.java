import java.util.Scanner;

public class Desen {
    static int plus(int n, int num) {
        System.out.print(n + " ");
        if (n <= 0) {
            return plus(n + 5, num);
        } else {
            return plus(n - 5, num);
        }        
    }   

    public static void main(String[] args) {

        int n, num = 1;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("N sayisıni giriniz: ");
            n = input.nextInt();
        }
        
        n = num;
        plus(n, num);
    }
}
