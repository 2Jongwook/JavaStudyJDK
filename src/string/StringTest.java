package string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");    // 힙 메모리(생성자의 매개변수로) 저장
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "test";       //상수 풀 저장
        String str4 = "test";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
