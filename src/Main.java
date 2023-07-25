public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int number) {
        if(number<0) number = number*(-1);
        String originalStr = String.valueOf(number);
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        return originalStr.equals(reversedStr);
    }
}