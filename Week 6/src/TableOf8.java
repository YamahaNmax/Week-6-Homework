import java.util.Scanner;

public class TableOf8 {

    public static void main(String[] args) {
        // Create an object to read user input
        Scanner x = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("Input first number: ");
        int number1 = x.nextInt();


        // Calculate for table
        int total1= number1 * 1;
        int total2 = number1 * 2;
        int total3 = number1 * 3;
        int total4 = number1 * 4;
        int total5 = number1 * 5;
        int total6 = number1 * 6;
        int total7 = number1 * 7;
        int total8 = number1 * 8;
        int total9 = number1 * 9;
        int total10 = number1 * 10;


        // Print the result
        System.out.println( number1 +  "  *  1  =  " + total1);
        System.out.println( number1 +  "  *  2  =  " + total2);
        System.out.println( number1 +  "  *  3  =  " + total3);
        System.out.println( number1 +  "  *  4  =  " + total4);
        System.out.println( number1 +  "  *  5  =  " + total5);
        System.out.println( number1 +  "  *  6  =  " + total6);
        System.out.println( number1 +  "  *  7  =  " + total7);
        System.out.println( number1 +  "  *  8  =  " + total8);
        System.out.println( number1 +  "  *  9  =  " + total9);
        System.out.println( number1 +  "  *  10 =  " + total10);



        // Close the scanner
        x.close();
    }
}
