/**********************************************************************************************************************************************
 * Teen Number Checker Exercise Description:
 * Method 1:
    - Write a method named hasTeen with 3 parameters of type int.
    - The method should return boolean, and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
    - Otherwise return false.
 * Method 2:
    - Write another method named isTeen with 1 parameter of type int.
    - The method should return boolean, and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
    - Otherwise return false.
 * NOTES:
    - All methods need to be defined as a public static.
    - This code solution does not contain main method.
 ********************************************************************************************************************************************/
public class TeenNumberChecker {
    /**
     * Modified to use the logic of isTeen
     * @param n
     * @param n2
     * @param n3
     * @return
     */
    public static boolean hasTeen(int n, int n2, int n3) {
        if (isTeen(n)) {
            return true;
        } else if (isTeen(n2)) {
            return true;
        } else return isTeen(n3);
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

}