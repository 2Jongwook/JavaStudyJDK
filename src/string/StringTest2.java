package string;

public class StringTest2 {
    public static void main(String[] args) {

        String str1 = new String("java");    // 힙 메모리(생성자의 매개변수로) 저장
        String str2 = new String("android");

        System.out.println(str1);
        System.out.println("처음 주소 값 " + System.identityHashCode(str1));
        //System.identityHashCode로 문자열 주소 값 나타내기

        str1 = str1.concat(str2);   //concat으로 문자열 연결

        System.out.println(str1);
        System.out.println("연결된 주소 값 " + System.identityHashCode(str1));

    }
}
