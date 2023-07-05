package section2;

/***********************************************************************************************************************
 * Number Palindrome Exercise
    - Write a method called isPalindrome with one int parameter called number.
    - The method needs to return a boolean.
    - It should return true if the number is a palindrome number, otherwise it should return false.

    E.g., isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
 **********************************************************************************************************************/
public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
            int last = number % 10;
            reverse *= 10;
            reverse += last;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
