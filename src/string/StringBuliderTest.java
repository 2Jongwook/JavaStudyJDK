package string;

public class StringBuliderTest {
    public static void main(String[] args) {

        String str1 = new String("java");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1); //StringBuilder 생성
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer));
        //StringBuilder는 같은 메모리에서 문자열을 연결시킨다.

        str1 = buffer.toString(); //buffer를 String클래스로 변환
        System.out.println(str1);
    }
}
