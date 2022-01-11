import java.util.Scanner;

public class RecursivePow {
    
    static int Power(int a, int power) {

        if (power == 0) {
            return 1; 
        }
        else return a*Power(a,power-1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Bir sayi giriniz: ");
        a = input.nextInt();
        System.out.print("Üs sayisini giriniz: ");
        b = input.nextInt();

        System.out.print("İslem sonucu: " + Power(a, power));
    }


}
