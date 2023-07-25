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
        System.out.println("-------numberToWords--------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
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

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        char[] givenNumbers = String.valueOf(number).toCharArray();
        String result = "";
        for (char num : givenNumbers) {
            int index = Integer.parseInt(Character.toString(num));
            if (result.equals("")) {
                result = numbers[index];
            } else {
                result = result + " " + numbers[index];
            }
        }
        return result;
    }
}


