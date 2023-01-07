package collection회원관리Ex.hashset;


import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");

        System.out.println(hashSet);

        hashSet.add("bbb");
        System.out.println(hashSet);
    }
}
