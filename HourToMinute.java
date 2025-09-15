// HourToMinute (No need to Write)
import java.util.Scanner;

public class HourToMinute {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hour:");
        double hour = sc.nextDouble();

        double minute = hour*60;
        System.out.println( hour + " hour is equal "+ minute + " minute");
    }
}
