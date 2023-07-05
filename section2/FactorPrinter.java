package section2;

/***********************************************************************************************************************
 * All Factors (Factor Printer) Exercise
    - Write a method named printFactors with one parameter of type int named number.
    - If number is < 1, the method should print "Invalid Value".
    - The method should print all factors of the number.
        A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

    E.g., printFactors(32); → should print 1 2 4 8 16 32

    HINT: Use a while or for loop.
 **********************************************************************************************************************/
public class FactorPrinter {
    public static void printFactors(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        if (n < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= n; i ++) {
            if (n % i == 0) {
                stringBuilder.append(i).append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}