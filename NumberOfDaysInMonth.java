/***********************************************************************************************************************
 * Number Of Days In Month Exercise Description:
    - Write a method isLeapYear with a parameter of type int named year.
    - The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    - If the parameter is not in that range return false.
    - If it is in the valid range, calculate if the year is a leap year and return true if it is.
    - Otherwise return false.

    - Write another method getDaysInMonth with two parameters month and year. Both of type int.
    - If parameter month is < 1 or > 12 return -1.
    - If parameter year is < 1 or > 9999 then return -1.

    NOTES:
        - The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method.
        - Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
        - Do not add a main method to solution code.
 **********************************************************************************************************************/
public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        boolean isLeapYear = isLeapYear(year);
        if (year >= 1 && year <= 9999) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 2 -> {
                    if (isLeapYear) {
                        return 29;
                    }
                    return 28;
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }
}