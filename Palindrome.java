public class Palindrom {

    static boolean isPalindrome(int number) {

        int tempNumb = number, revNum = 0, lastNumb;
        
        while(tempNumb != 0) {

            lastNumb = tempNumb % 10;
            revNum = (revNum * 10) + lastNumb;
            tempNumb /= 10;
        }

            if (number == revNum)
            return true;
            else
            return false;
    }

    static public void main(String[] args) {

        System.out.print(isPalindrome(99));

    }
}
