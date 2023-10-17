public class PrintMIT {
    public static void main(String[] args) {
        String[] M = {
                "*             *",
                "* *         * *",
                "*  *       *  *",
                "*    *   *    *",
                "*      *      *",
                "*             *",
                "*             *",
                "*             *",
                "*             *"
        };

        String[] I = {
                " *********** ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                " *********** "
        };

        String[] T = {
                "*************",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      ",
                "      *      "
        };


        for (int line = 0; line < 9; line++) {      // Print the Letters
            System.out.println(M[line] + "  " + I[line] + "  " + T[line]);
        }
    }
}
