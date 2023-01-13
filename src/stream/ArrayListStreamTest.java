package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("홍길동");
        sList.add("김길동");
        sList.add("이길동");

        Stream<String> stream = sList.stream(); //리스트로 스트림 생성
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println("========정렬========");

        sList.stream().sorted().forEach(s -> System.out.println(s + " "));
        // 앞서 forEach 메서드로 자료를 소모했기 때문에 새로 생성해야한다.
    }
}
