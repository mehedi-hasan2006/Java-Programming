// Nested Interface
interface Exam{
    String Name = "BTEB";
}
interface Bash{
    String Bash = "Exam";
}
interface Year{
    int Year = 2026;
}

class January implements Exam, Bash, Year{
    String Special;

    public void showDisplay(){
        System.out.println("Nam hoilo: " + Name);
        System.out.println("Bash dey shudhuh : "+Bash);
        System.out.println("Bash khamu kon sale: "+ Year);
    }

    void GetSepcical(){
        Special = "SHudu Chill R Chill";
    }

    void showSpecial(){
        System.out.println(Special);
    }
}
public class Nested_Interface {
    public static void main(String[] args) {
        January Janu = new January();

        Janu.showDisplay();
        Janu.GetSepcical();
        Janu.showSpecial();
    }

}
