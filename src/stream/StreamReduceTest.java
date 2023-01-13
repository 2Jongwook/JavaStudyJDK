package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{


    //BinaryOperator 클래스를 정의해 긴 문자열 출력
    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else return s2;
    }
}

public class StreamReduceTest {
    public static void main(String[] args) {

        String[] arr = {"제일 긴 문자열이 출력됩니다.", "짧은 문자", "안뇽하세요", "Java Study"};

        //람다식으로 길이가 긴 문자열 출력
        System.out.println(Arrays.stream(arr).reduce("", (s1, s2) -> {
            if(s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2;
        }));

        System.out.println("==아래는 BinaryOperator 클래스를 이용한 출력==");

        String str = Arrays.stream(arr).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
