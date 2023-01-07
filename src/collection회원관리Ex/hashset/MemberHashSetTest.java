package collection회원관리Ex.hashset;
import collection회원관리Ex.Member;


public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "이순신");
        Member memberHong = new Member(102, "홍길동");
        Member memberKim = new Member(103, "김길동");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(memberKim);

        memberHashSet.showAll();
    }
}
