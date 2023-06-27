/*******************************************************************************************************************
 * Mega Bytes Converter Exercise
 Description:
     Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
     The method should not return anything (void) and it needs to calculate the megabytes and
        remaining kilobytes from the kilobytes parameter.

     Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
     XX represents the original value kiloBytes.
     YY represents the calculated megabytes.
     ZZ represents the calculated remaining kilobytes.

    TIPS/NOTES:
        - Use the modulus operator
        - 1 MB = 1024KB
        - Do not set kilobytes parameter value inside your method.
        - The printMegaBytesAndKiloBytes method needs to be defined as public static

    Main method is not included within this code.

 ********************************************************************************************************************/
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
        }   }

}