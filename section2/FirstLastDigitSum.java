package section2;

/***********************************************************************************************************************
 * First and Last Digit Sum Exercise
    - Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    - The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
    - If the number is negative, then the method needs to return -1 to indicate an invalid value.

    E.g., sumFirstAndLastDigit(257); → should return 9,
        the first digit is 2, and the last is 7, which gives us 2+7, and the sum is 9.
 **********************************************************************************************************************/
public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastDigit = number % 10;
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number * 2;
        } else {
            do {
                number /= 10;
            } while(number >= 10);

            sum += number;
            return lastDigit + sum;
        }
    }
}