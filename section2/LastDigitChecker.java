package section2;

/***********************************************************************************************************************
 * Last Digit Checker Exercise
    - Write a method named hasSameLastDigit with three parameters of type int.
    - Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
        If one of the numbers is not within the range, the method should return false.
    - The method should return true if at least two of the numbers share the same rightmost digit;
        otherwise, it should return false.

    E.g., hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71.

    - Write another method named isValid with one parameter of type int.
    - The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
        otherwise return false.

    E.g., isValid(1051); → should return false since 1051 is not within the range of 10-1000.
 **********************************************************************************************************************/
public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) || isValid(y) || isValid(z)) {
            return false;
        } else
            return (x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10);
    }

    public static boolean isValid(int number) {
        return number < 10 || number > 1000;
    }
}
