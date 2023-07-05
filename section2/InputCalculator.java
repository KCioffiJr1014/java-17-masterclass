package section2;

import java.util.Scanner;

/**
 * Input Calculator Exercise
    - Write a method called inputThenPrintSumAndAverage that does not have any parameters.
    - The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
    - When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
        * XX represents the sum of all entered numbers of type int.
        * YY represents the calculated average of all numbers of type long.
    E.g., EXAMPLE OF INPUT/OUTPUT:
     INPUT:
     1
     2
     3
     4
     5
     a
     OUTPUT
     SUM = 15 AVG = 3

     TIP: Use Scanner to read an input from the user.
     TIP: Use casting when calling the round method since it needs double as a parameter.
     NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.
 */
public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int count = 0;
        double sum = 0;
        long avg;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            try {
                int newNumber = Integer.parseInt(input);
                count++;
                sum += newNumber;

            } catch (Exception e) {
                break;
            }
        }
        avg = Math.round(sum/count);
        System.out.println("SUM = " + (int) sum + " AVG = " + avg);
    }
}
