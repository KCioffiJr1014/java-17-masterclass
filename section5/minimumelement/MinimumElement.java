package section5.minimumelement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    private static int[] readElements(int number) {
        System.out.println("Please provide me with a list of " + number + " numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide the numbers of elements you would like to add to an array: ");
        return scanner.nextInt();
    }
}