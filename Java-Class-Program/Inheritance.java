class A {
    void method1() {
        String name = "mehedi";
        int roll = 811914;

        System.out.println(name);
        System.out.println(roll);
    }
}

class B extends A {
    void method2() {
        String dept = "CST";

        System.out.println(dept);
    };

}

class  C extends B{
    void method3(){
        System.out.println("kurigram polytechnic institute");
    }
}

public class Inheritance {
    public static void main(String[] agrs) {

        C ob = new C();

        ob.method1();
        ob.method2();
    }
}
