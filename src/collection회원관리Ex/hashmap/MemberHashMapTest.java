package collection회원관리Ex.hashmap;

import collection회원관리Ex.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(101, "이길동");
        Member memberKim = new Member(102, "김길동");
        Member memberHong = new Member(103, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAll();
    }
}
