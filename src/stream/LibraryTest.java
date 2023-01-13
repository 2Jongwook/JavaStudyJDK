package stream;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("Java", 20000));
        books.add(new Book("Python", 15000));
        books.add(new Book("C++", 30000));

        int total = books.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("모든 책 가격의 합은 " + total + "원 입니다.");

        books.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName())
                .sorted().forEach(s -> System.out.println(s));
    }
}
