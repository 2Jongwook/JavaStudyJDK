package collection회원관리Ex.arraylist;

import collection회원관리Ex.Member;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();


        Member member1 = new Member(101, "이순신");
        Member member2 = new Member(102, "홍길동");
        Member member3 = new Member(103, "이종욱");
        Member member4 = new Member(104, "홍길순");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(member2.getMemberId());
        memberArrayList.showAllMember();

        memberArrayList.insertMember(member4, 0);
        memberArrayList.showAllMember();
    }
}
