// Find Leap Year
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year= scanner.nextInt();

        if((year%4==0 ) && (year %100!=0) || (year%400==0)){
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year");
        }
    }
}

// Find Leap Year using printf method
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year= scanner.nextInt();

        if((year%4==0 ) && (year %100!=0) || (year%400==0)){
            System.out.printf(" %d is a leap year",  year);
        }
        else{
            System.out.printf("%d is not a leap year", year);
        }
    }
}
