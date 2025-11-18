// linear search method in array of java
import java.util.Scanner;

public class Array {
    public static void main(String args[]){

        //Scanner object
        Scanner sc= new Scanner(System.in);

        System.out.print("Input Array Size: ");
        // input array size
        int arraySize = sc.nextInt();

        // store array size in array or creating an array with size
        int numbers [] = new int[arraySize];

        //input array value
        for(int i=0; i<arraySize; i++){
            System.out.print("Input Array Vaue: ");
            numbers[i]= sc.nextInt();
        }

        // input value of x
        System.out.print("Enter the value of x, Which you want to search: ");
        int x= sc.nextInt();

        // search value of x in array
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.printf( "%d is found index of %d", x, i);
            }
        }
    }
}
