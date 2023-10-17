public class Calculation3 {

    public static void main(String[] args) {

        // Define the two numbers

        int a = 5;
        int b = 8;
        int c = 6;
        int d = 55;
        int e = 9;
        int f = 20;
        int g = 3;
        int h = 15;
        int i = 2;

        int total1 = -a+b*c;
        int total2 = (d+e)%e;
        int total3 = f+-g*a/b;
        int total4 = a+h/g*i-b%g;


        System.out.println("Total=" +total1);   // Print  result
        System.out.println("Total=" +total2);   // Print  result
        System.out.println("Total=" +total3);   // Print  result
        System.out.println("Total=" +total4);   // Print  result


        //Another Way

        int resultA = -5 + 8 * 6;

        int resultB = (55 + 9) % 9;

        int resultC = 20 + -3*5 / 8;

        int resultD = 5 + 15 / 3 * 2 - 8 % 3;

        // Print results

        System.out.println("Result of A = " + resultA);
        System.out.println("Result of B = " + resultB);
        System.out.println("Result of C = " + resultC);
        System.out.println("Result of D = " + resultD);

    }
}
