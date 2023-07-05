package section2;

/***********************************************************************************************************************
 * Shared Digit Exercise
    - Write a method named hasSharedDigit with two parameters of type int.
    - Each number should be within the range of 10 (inclusive) - 99 (inclusive).
        If one of the numbers is not within the range, the method should return false.
    - The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
        otherwise, the method should return false.

    E.g., hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99.
    E.g., hasSharedDigit(15, 55); → should return true since the number 5 appears in both numbers.
 **********************************************************************************************************************/
public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne > 99 || numberOne < 10 || numberTwo > 99 || numberTwo < 10) {
            return false;
        } else
            return ((numberOne / 10 == numberTwo / 10) || (numberOne % 10 == numberTwo / 10) || (numberOne / 10 == numberTwo % 10) || (numberOne % 10 == numberTwo % 10));
    }
}