package section1;

/*******************************************************************************************************************************************************
 * Speed Converter Exercise
 Description:
    First method:   Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
                    This method needs to return the rounded value of the calculation of type long.

                    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
                    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

    Second Method:  Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
                    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.

                    Then it needs to print a message in the format "XX km/h = YY mi/h".
                     XX represents the original value kilometersPerHour.
                     YY represents the rounded milesPerHour from the kilometersPerHour parameter.
                     If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

                     Use method Math.round to round the number of calculated miles per hour (double). The method should return long.
                     NO ADDED MAIN METHOD IN THIS CODE.
                     All methods should be defined as public static
                     1 mile per hour is 1.609 kilometers per hour
 ****************************************************************************************************************************************************/
public class SpeedConverter {
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
}
