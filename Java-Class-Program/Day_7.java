import java.util.Scanner;

public class day_7 {
    public static void main(String[] args) {

        //practice question solve
        String singal = "green";

        if(singal == "green"){
            System.out.println("Stop");
        } else {
            System.out.println("go");
        }


        // find month name with month number    ||  sunday = 1 , monday = 2, tuesday = 3,...........
        Scanner sn= new Scanner(System.in);

        System.out.print("Enter a number between 1 to 7: ");
        int num = sn.nextInt();
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Valid number!!!!");
        }
        // alternative
        if (num==1){
            System.out.println("1 = Sunday");
        }else if(num==2){
            System.out.println("2 = Monday");
        }else if (num==3){
            System.out.println("Tuesday");
        }else {
            System.out.println("Enter Valid number!!!!");
        }
    }
}
