public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 454;    // this is number will be checked palindrome number
        int result = 0;     // store calculation
        int temp = number; // this is temporary variable

        while (number>0){   // 
            int cal = number % 10;
            result= (result*10)+cal;
            number= number / 10;
        }

        if (temp==result){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
