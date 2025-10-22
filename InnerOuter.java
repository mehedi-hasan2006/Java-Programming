// inner outer for loop== large to small
public class InnerOuter {
    public static void main(String[] args) {

        for (int i =7; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" " +j);
            }
            System.out.println(" ");
        }
    }
}

// inner outer for loop== small to large
class InOut{
    public static void main(String[] args) {
        for (int k=1; k<=5; k++){
            for (int l=1; l<=k; l++){
                System.out.print(" " +l);
            }
            System.out.println("\n");
        }
    }
}
