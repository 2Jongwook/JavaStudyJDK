package object;

import java.util.Objects;
/*
-equals()는 두 객체가 논리적으로 같은가를 확인해야하는데 상위 클래스의
  equals가 논리적 동치성을 비교하도록 재정의되지 않았을 때 재정의한다.

-equals()와 hashcode()는 항상 같이 재정의 한다.
    (그렇지 않으면 hashcode의 일반 규약을 어기게 되어 해당 클래스의 인스턴스를
     HashMap이나 HashSet 같은 컬렉션의 원소로 사용할 때 문제를 일으키게 된다.)

-값객체(Value Object)에는 equals()와 hashCode()를 재정의하자.
*/

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}

