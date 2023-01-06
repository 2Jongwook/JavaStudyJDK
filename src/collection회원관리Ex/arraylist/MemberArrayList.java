package collection회원관리Ex.arraylist;

import collection회원관리Ex.Member;
import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public void insertMember(Member member, int index){
        arrayList.add(index, member);
    }

    /**
     *
     * @param memberId
     * @return
     */
    public boolean removeMember(int memberId){
        for(int i = 0; i < arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "는 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
