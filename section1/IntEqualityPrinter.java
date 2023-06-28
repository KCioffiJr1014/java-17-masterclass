package section1;

/***********************************************************************************************************************
 * Integer Equality Printer Exercise Description:
    - Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    - If one of the parameters is less than 0, print text "Invalid Value".
    - If all numbers are equal print text "All numbers are equal"
    - If all numbers are different print text "All numbers are different".
    - Otherwise, print "Neither all are equal nor different".

    NOTES:
        - The method printEqual needs to be defined as public static like we have been doing so far in the course.
        - Do not add main method to solution code.
 **********************************************************************************************************************/
public class IntEqualityPrinter {
    public static void printEqual(int var1, int var2, int var3) {
        if (var1 < 0 || var2 < 0 || var3 < 0) {
            System.out.println("Invalid Value");
        } else if (var1 == var2 && var1 == var3) {
            System.out.println("All numbers are equal");
        } else if (var1 != var2 && var1 != var3 && var2 != var3) {
            System.out.println("All numbers are different");
        } else
            System.out.println("Neither all are equal or different");
    }
}