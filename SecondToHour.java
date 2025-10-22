public class SecondToHour {
    public static void main(String[] args) {
        int inputSecond = 1260;

        int minute = inputSecond/60;
        int hour = minute/60;

        int newMinute= minute - hour*60;
        int newSecond = inputSecond- minute*60;

        System.out.println(hour);
        System.out.println(newMinute);
        System.out.println(newSecond);

    }
}
