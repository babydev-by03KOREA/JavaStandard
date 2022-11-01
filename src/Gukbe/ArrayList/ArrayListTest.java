package Gukbe.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("자바스크립트 + 제이쿼리 입문", "황재호"));
        library.add(new Book("스프링5 프로그래밍 입문", "최병균"));
        library.add(new Book("Java 의 정석 1", "남궁성"));
        library.add(new Book("Java 의 정석 2", "남궁성"));
        library.add(new Book("Java 의 정석 초급", "남궁성"));

        for (Book book : library) {
            book.showInfo();
        }

    }
}
