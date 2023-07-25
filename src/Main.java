public class Main {
    public static void main(String[] args) {
        System.out.println("-------isPalindrome--------");
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println("-------isPerfectNumber--------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }


    public static boolean isPalindrome(int number) {
        if (number < 0) number = number * (-1);
        String originalStr = String.valueOf(number);
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        return originalStr.equals(reversedStr);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }
}


