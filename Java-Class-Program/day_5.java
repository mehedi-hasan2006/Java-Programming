
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        // তিনটি সংখ্যার গড় নির্ণয়
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int num1= sc.nextInt();

        System.out.print("Enter b: ");
        int num2= sc.nextInt();

        System.out.print("Enter c: ");   // 6-3+4*6/2=?
        int num3= sc.nextInt();

        double average=  (num1 + num2 + num3) / 3 ;   // ctrl + z = undo

        System.out.println("This is your average value: "+average);


        // আয়তের ক্ষেত্রফল নির্ণয়

        System.out.println("Enter height: ");   // 5^2=25   5*5=25
        int r=sc.nextInt();

        System.out.println("Enter Width: ");
        int width = sc.nextInt();

        double area= Math.PI * r*r;

        System.out.println("Your result is " + area);

        sc.close();
    }
}
