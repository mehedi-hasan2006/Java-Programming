// Prime Number 1 to 100
public class PrimeNumber {
    public static void main(String[] args) {

        for(int i=2; i<=100; i++){
            int count =0;

            for (int j=1; j<=i; j++){
                if (i % j ==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + " ");
            }
        }
    }
}


// check prime number

public class PrimeNumber{
    public static void main(String[] args) {
        int a = 10;
        int prime=0;

        for(int i =2; i<a; i++){
            if (a % i==0) {
                 prime++;
                break;
            }
        }
        if (prime==0) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
