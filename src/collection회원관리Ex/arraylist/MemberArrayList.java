package collection회원관리Ex.arraylist;

import collection회원관리Ex.Member;
import java.util.ArrayList;
import java.util.Iterator;

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
        /* for문을 이용해 데이터 꺼내기
        for(int i = 0; i < arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        */

        //Iterator를 사용해서 데이터 꺼내기 (순서가 없는 Set에서도 사용할 수 있다.) Set에서 사용
        Iterator<Member> iterator = arrayList.iterator(); // 제네릭 <Member>로 Iterator 선언
        while (iterator.hasNext()){             //hasNext() 메서드 : 다음 값이 있으면 true반환
            Member member = iterator.next();    // Next()로 다음 값 반환

            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(member);
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
