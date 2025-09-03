// Find Large Number 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       int a;
       int b;
       int c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a= scanner.nextInt();

        System.out.print("Enter value of b: ");
        b= scanner.nextInt();

        System.out.print("Enter value of c: ");
        c= scanner.nextInt();

       if (a>b) {
        if (a>c) {
            System.out.print(a);
        }
        else{
            System.out.println(c);
        }
       }
       else{
        if (b>c) {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
       }
       scanner.close();
    }
}