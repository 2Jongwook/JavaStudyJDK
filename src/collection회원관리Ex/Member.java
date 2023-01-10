package collection회원관리Ex;

public class Member implements Comparable<Member>{

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId() {

        return memberId;
    }

    public void setMemberId(int memberId) {

        this.memberId = memberId;
    }

    public String getMemberName() {

        return memberName;
    }

    public void setMemberName(String memberName) {

        this.memberName = memberName;
    }

    public String toString(){

        return memberName + "회원님의 아이디는" + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {     //String API문서를 보면 equals가 있다.
        if(obj instanceof Member){
            Member member = (Member)obj;

            if(this.memberId == member.memberId){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {   // TreeSet을 구성하기 위해 기준을 정하는 comparable인터페이스를 사용해야한다.
        return (this.memberId - member.memberId);   // 아이디를 기준으로 오름차순 정렬을 해준다.
        //return (this.memberId - member.memberId) * (-1); 을 해주면 내림차순 정렬
    }
}
