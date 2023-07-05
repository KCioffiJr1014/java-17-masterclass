package section2;

/***********************************************************************************************************************
 * Greatest Common Divisor Exercise
    - Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    - If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    - The method should return the greatest common divisor of the two numbers (int).
    - The greatest common divisor is the largest positive integer that can fully divide each of the integers
        (i.e. without leaving a remainder).

         For example 12 and 30:
         12 can be divided by 1, 2, 3, 4, 6, 12
         30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
         The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
            and there is no resulting remainder.

    E.g., getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder.

    HINT: Use a while or a for loop.
 **********************************************************************************************************************/
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int x, int y) {
        int greatestCommonDivisor = 0;

        if (x < 10 || y < 10) {
            return -1;
        }

        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}