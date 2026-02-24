public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
    private static boolean check(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return check(str, start + 1, end - 1);
    }
}
