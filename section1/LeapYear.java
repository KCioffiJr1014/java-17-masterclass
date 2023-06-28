package section1;

/****************************************************************************************************************************************************
 * Leap Year Calculator Exercise
 Description:
     Write a method isLeapYear with a parameter of type int named year.
     The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     If the parameter is not in that range return false.
     Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

     Notes:
        - The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
        - Do not add a  main method to solution code.
 ***************************************************************************************************************************************************/
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
    }
}