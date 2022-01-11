import java.util.Scanner;

public class SmartCalculator {
    

    static int sum(int a, int b) {
        int result = 1;
        result = a + b;
        System.out.println("Toplama sonucu: " + result);
        return result;
    }
    
    static int minus(int a, int b) {
        int result = 1;
        result = a - b;
        System.out.println("Cikarma sonucu: " + result);
        return result;
    }

    static int multiple(int a, int b) {
        int result = 1;
        result = a * b;
        System.out.println("Carpma sonucu: " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = 1;
        result = a / b;
        if (b == 0) {
            System.out.print("Bir sayi sifira bolunemez.");
        } else {
        System.out.println("Bolme sonucu: " + result);
        }
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Uslu islem sonucu: " + result);
        return result;
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama,\n"
                    + "2 - Cikarma,\n"
                    + "3 - Carpma,\n"
                    + "4 - Bolme,\n"
                    + "5 - Uslu Sayi Hesaplama\n"; 


                System.out.print(menu);
                


        while(true) {
            int a, b;

            System.out.print("Bir islem seçiniz: ");
                select = input.nextInt();

            System.out.print("Birinci sayi giriniz: ");
            a = input.nextInt();
            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();

            if (select == 0) {
                break;
            }

            switch(select) {

                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiple(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                default:
                    System.out.print("Gecersiz islem.");

            }

        }

    }

}
