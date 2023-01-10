package collection회원관리Ex.treeset;

import collection회원관리Ex.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김길동");
        Member memberHong = new Member(103, "홍길동");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberHong);

        memberTreeSet.showAll();

        Member memberLee2 = new Member(104, "이순신2");
        memberTreeSet.addMember(memberLee2);

        memberTreeSet.showAll();
    }
}
