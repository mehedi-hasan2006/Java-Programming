//  Series Addition  use for loop

import java.util.Scanner;

public class SeriesAddition {
    public static void main(String[] args) {

        // 1+2+3+4 +...........+10
        int sum = 0;

        for( int i =1; i<=10; i++){
             sum += i;
        }
        System.out.println(sum);



        // 1^2 + 2^2 + 3^2 +........
        int zogfol = 0;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter value: ");
        int n= sc.nextInt();

        for (int i = 1; i<=n; i++){
            zogfol += (i*i);
        }
        System.out.printf("your zogfol is %d \n", zogfol );


        // 1+ 1/4 + 1/9 + ........... + 1/ m^2

        double result =0;
        System.out.print("Enter value of m: ");
        int m = sc.nextInt();

        for(int i =1; i<=m; i++){

            result= result + ( 1/ (i*i));
        }
        System.out.print("your result is : "+ result);



        // 1*2 + 2*2+ 3*3 + ..........
        int s = 0;
        int num = 4;

        for (int i = 1; i<=num; i++){
            s = s + i*(i+1);
        }
        System.out.println(s);




        sc.close();
    } 
}
