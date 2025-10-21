import java.util.Scanner;

public class RevisionClass {
    public static void main(String[] args) {
        // Second To Hour
        int second= 1260;

        int minute = second /60; //21   // int hour  = second /3600;
        int hour = minute /60; //0

        int newMinute = minute - (hour*60); // camelCase
        int newSecond = second- (minute*60);


        System.out.println(second + " second is equal " + hour + " hour " + newMinute + " minute " + newSecond + " second");



        // Minute to hour

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ur minute: ");
        int Minute = scan.nextInt();

        int Hour = Minute/60;  // output = 1 hour
//        int NewMinute = Minute - Hour*60; // 65-60
        int NewMinute = Minute %60;

        System.out.println(Minute + " minute is equal to " + Hour + " hour " + NewMinute + " minute");

       // 131 =131  432= 234

        // palindrome number

        int a =131; // 131/10= 13, 1 & 13/10= 1, 3 &  1/10= 0, 1
        int c =0;
        int temp=a;

        while (a>0){
            int b= a%10;
            c=c*10+b;
            a=a/10;
        }
        if (temp==c){
            System.out.println("palindrome");
        }
        else {
            System.out.println(" not palindrome");
        }

        int f0=0;     int f1=1;  int f2;

        for (int i=1; i<10; i++){
            f2= f0+f1;
            System.out.println(f2);

            f0=f1;
            f1=f2;
        }
    }
}
