// ইন্টারফেস ব্যবহার করে প্রোগ্রাম
interface Students{
   int Roll = 811914;
   String Name = "Mehedi Hasan";

    void Display();  // optional
}

class Result implements Students{
    public int Mark;
    public void Display(){
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }

    public void GetMark(){
        Mark = 85;
    }

    public void showMark(){
        System.out.println("Marks is: " + Mark);
    }
}

public class Interface {
    public static void main(String[] args) {

        Result R = new Result();

        R.Display();
        R.GetMark();
        R.showMark();
    }
}
