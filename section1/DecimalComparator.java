package section1;

/****************************************************************************************************************************************
 * Decimal Comparator Exercise
 Description:
    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places.
    Otherwise, return false.

    TIPS/NOTES:
        - Use casting
        - The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
        - Do not add a  main method to solution code.
 *****************************************************************************************************************************************/
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2) {
        v1 = (int) (v1 * 1000);
        v2 = (int) (v2 * 1000);

        return v1 == v2;
    }
}