package object;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9, 18, 2022);
        MyDate date2 = new MyDate(9, 18, 2022);
        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
