package object;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {  //toString 재정의로 문자열을 정상적으로 반환할 수 있다.
        return title + ", " + author;
    }
}
public class ToStringEx {

    public static void main(String[] args) {

        Book book = new Book("자바", "은종");
        //toString으로 재정의 하지 않으면 object.Book@3b07d329으로 출력된다.
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);
    }
}
