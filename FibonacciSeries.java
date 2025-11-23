// "\t" ==> means 1 tap space between 2 values
// you can also this program getting user input by using Scanner class

public class FibonacciSeries {
    public static void main(String[] args) {
        int n= 10;
        int f0= 0;
        int f1= 1;
        int f;

        System.out.print(f0 + "\t"); 
        System.out.print(f1 + "\t");

        for (int i=1; i<=n-2; i++){

            f= f0+f1;
            System.out.print(f + "\t");
            f0=f1;
            f1=f;
        }
    }
}
