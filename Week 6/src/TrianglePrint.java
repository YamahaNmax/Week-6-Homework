public class TrianglePrint {
        public static void main(String[] args) {

            int rows = 6;    //rows for the triangle

            // loop for  rows
            for (int i = 1; i <= rows; i++) {

                //loop to print * for row
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();        //after printing * move to next line
            }
        }
}


