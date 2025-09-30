import java.util.Scanner;

public class Day_9 {
    public static void main(String[] args) {
       // practice 1
        int      b= 4;
       String      d="5";
        b*=5;   // b=20
        System.out.println(b+d);

        //practice 2

        for(int j=10; j>0; j--){

            System.out.print(j + " ");
        }

        // Odd & Even nunber

        for(int k=1; k<=49; k+=2){
            System.out.println(k);
        }

        // user input

        Scanner scanner=  new Scanner(System.in);

        System.out.print("Enter your value: ");
        int input= scanner.nextInt();

        int sum=12;
        for(int m=2; m<=input; m+=2){
            sum = sum + m;
            System.out.println(sum);
        }
    }
}
