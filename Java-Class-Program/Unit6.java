public class Unit6 {

    String car;
    String color;

    public void start(){
        System.out.println("The car name is " + car);
    }

    public  void stop(){
        System.out.println("Car color is " + color);
    }


    public static void main(String[] args){

        Unit6 ob= new Unit6();
        ob.car= "BMW";
        ob.start();

        Unit6 ob1= new Unit6();
        ob1.color = "Black";
        ob1.stop();
    }
}
