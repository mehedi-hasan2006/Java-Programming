// day 8 (Swapping)
public class Swapping {
    public static void main(String[] args){
    // Swapping is a inferchange of two variable value.
        // 1. additon & subraction, 2. help 3rd variable
       // 3. Bitwise XOR


        // 1. addition & subraction
        int a= 8;
        int b= 6;
        a= a-b;
        b= a+b;
        a= b-a;

        System.out.println("a=8 & new a=: "+ a);
        System.out.println( "b=6 & new b = : "+ b);


//        2. help 3rd variable
        int x=2, y=3, z;

        z= x;   // z=2
        x= y;    // x=3
        y= z;    // y=2
       System.out.println(x);
       System.out.println(y);


        // 3. Bitwise XOR (^)
        int A=10, B=20;
        A=A^B;
        B=A^B;
        A=A^B;
        System.out.println(A);
        System.out.println(B);

    }

}
