import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a=scanner.nextDouble();

        System.out.print("Enter value of b: ");
        b=scanner.nextDouble();

        System.out.print("Enter value of c: ");
        c=scanner.nextDouble();

        double s= (a+b+c)/2;

        if((a+b)>c && (b+c)>a  && (c+a)>b){
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.print("Triangle Area is: " + area);
        }
        else{
            System.out.println("Triangle is not possible");
        }

        scanner.close();
    }
}