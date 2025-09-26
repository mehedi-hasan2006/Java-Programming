import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args){
        // দিনকে মাসে রূপান্তর (30 days = 1 month) 50%30 = 1m 20d   (ছোট থেকে বড় বের করলে গুন এবং বড় থেকে ছোট বের করলে ভাগ করতে হবে।)
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Your Days numbers: ");
        int day= sc.nextInt();

        int month =day/30;    // 5 days = 0 month
        int DAY = day % 30;
        System.out.println( day + " Days = " + month + " month " + DAY + " days" );

        //  মাসকে দিনে রূপান্তর
        System.out.print("Enter Your months numbers: ");
        int m= sc.nextInt();

        int d= m*30;
        System.out.println(m + " month = " + d + " Days");
        
        sc.close();
    }
}
