public class Operator {
    public static void main(String[] args){
        // logical operator
        int a = 50;
        int b = 50;
        int c= 70;

        boolean d= b>a && c>b;  //AND operation
        System.out.println(d);

        boolean e= a>b || c>a;  // OR operation
        System.out.println(e);

        boolean f= a!=b;
        System.out.println(f);



        // increment  ( বাড়বে )   2 prokar = 1. pre-fix (++a)  2. postfix (a++)
        // decrement  ( কমবে )    2 prokar = 1. prefix (--a)    2. post fix (a--)

        // pre-fix increment
        int x= 5;
        int y = ++x;
        System.out.println(y);
//
//        //postfix increment
         int z= 15;
         int j= z--;
        System.out.println(j);
        System.out.println(z);

//   keyboard shortcut  for comment = ctrl + /
        // special operator (concatination)
        String firstName = "Mehedi";  // camel case
        String lastName = "Hasan";
        String fullNamme =  firstName + lastName;
        System.out.println("you full name is : " + firstName + " " + lastName );

// concatiantion on String $ int
        String w=  "8";
        int z = 5;

        System.out.println(w+ z);
        System.out.println(w+ z);

        // relational operator ==, <, >, <=, >=, !=

        int p= 15;
        int q= 19;
        if(p>q){    // condition = শর্ত  ( if, else-if, if-else, else)
            System.out.println("p is large"); //true
        } else{
            System.out.println("q is large"); //False
        }

        int hh= 46;
        int jj=hh;
        System.out.println(jj);





        // different between print() & println()
        System.out.println("rafat");
        System.out.println("rafat");
        System.out.print("rafat");
        System.out.print("rafat");
    }
}
