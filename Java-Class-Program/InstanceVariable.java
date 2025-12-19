public class InstanceVariable {

     int number =100 ;
     int number2 = 200;



    public void show(){
        int sum = number + number2;
        System.out.println("THe number is " + sum);
    }


    public static void main(String[] args){
        InstanceVariable ob= new InstanceVariable();
        ob.show();
    }
}
