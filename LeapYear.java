// Find Leap Year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter prefer year: ");
        int year= scanner.nextInt();


        if(year%4==0){
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year");
        }

        scanner.close();
    }
}
