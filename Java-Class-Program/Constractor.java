public class Constractor {

    public int sum(int a, int b){
        int add = a+b;
        System.out.println(add);
        return 0;
    }

    public float sum(float c, float d){
        float add2= c+d;
        System.out.println(add2);
        return 0;
    }


    public static void main(String[] args) {

        Constractor sc= new Constractor();

        sc.sum(10,20);
        sc.sum(30,40);

    }
}
