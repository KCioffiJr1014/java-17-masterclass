package section2;

/***********************************************************************************************************************
 * Even Digit Sum Exercise
    - Write a method named getEvenDigitSum with one parameter of type int called number.
    - The method should return the sum of the even digits within the number.
    - If the number is negative, the method should return -1 to indicate an invalid value.

    E.g., getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 **********************************************************************************************************************/
public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        } while (number > 0) {
            int trailingDigit = number % 10;
            if (trailingDigit % 2 == 0) {
                sum += trailingDigit;
            }
            number = number / 10;
        } return sum;
    }
}