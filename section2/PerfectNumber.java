package section2;

/***********************************************************************************************************************
 * Perfect Number Exercise
    - A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    - For example, take the number 6:
        Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded),
        and the sum of its proper divisors is 1 + 2 + 3 = 6.

    - Write a method named isPerfectNumber with one parameter of type int named number.
    - If number is < 1, the method should return false.
    - The method must calculate if the number is perfect. If the number is perfect, the method should return true;
        otherwise, it should return false.

    E.g., isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and
        the sum is 1 + 2 + 4 + 7 + 14 = 28

    HINT: Use a while or for loop.
 **********************************************************************************************************************/
public class PerfectNumber {

    public static boolean isPerfectNumber(int n) {
        int count = 0;
        if (n < 1) {
            return false;
        }
        for (int i = 1; i < n; i ++) {
            if (n % i == 0) {
                count += i;
                System.out.println(count);
            }
        }  return count == n;
    }
}
