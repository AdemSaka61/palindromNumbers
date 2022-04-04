public class plndrmNumbers {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println(reverseNumber);
        }

        if (number == reverseNumber) {

            System.out.println(number + " " +"Palindrom Sayıdır.");
            return true;
        } else {
            System.out.println(number + " " +"Palindrom Sayı Değildir.");
            return false;
        }
    }

    public static void main(String[] args) {

        isPalindrom(2356);
    }
}
