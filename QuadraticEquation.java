// Quadratic Equation
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter A: ");  // 25
        double A= sc.nextDouble();

        System.out.print("Enter B: ");  // 36
        double B= sc.nextDouble();

        System.out.print("Enter C: ");  // 12
        double C= sc.nextDouble();

        double D= (B*B)- (4 * A * C);

        if (D>0){
            double x1 = (-B + Math.sqrt(D))/ (2 * A);
            double x2 = (-B - Math.sqrt(D))/ (2 * A);

            System.out.print("The roots Are " + x1 + " and " + x2);
        }
        else if (D==0) {
            double x= -B / (2 * A);
        }
        else {
            System.out.print("The root are not possible");
        }


        sc.close();

    }
}
