public class PrintTriangle2 {
    public static void main(String[] args) {
        int rows = 6;    // number of rows for the triangle


        for (int i = 1; i <= rows; i++) {   // Outer loop Iterate over each row


            for (int j = 1; j <= rows - i; j++) {   // Inner loop for spaces
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {    // Inner loop for *
                System.out.print("*");
            }

            // Move to the next line after completing the row
            System.out.println();
        }
    }
}

