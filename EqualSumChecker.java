/***********************************************************************************************************************
 * Equal Sum Checker Exercise
 * Write a method hasEqualSum with 3 parameters of type int.
    The method should return boolean,
    and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
    Otherwise, return false.

    Notes:
        - The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
        - Do not add a  main method to solution code.
 **********************************************************************************************************************/
public class EqualSumChecker {
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        return n1 + n2 == n3;
    }
}