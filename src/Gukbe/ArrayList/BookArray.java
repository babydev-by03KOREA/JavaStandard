package Gukbe.ArrayList;

public class BookArray {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

//        for(int i = 0; i<library.length; i++) {
//            System.out.println(library[i]);
//        }

        library[0] = new Book("Java의 정석 기초 1", "남궁성");
        library[1] = new Book("Java의 정석 기초 2", "남궁성");
        library[2] = new Book("Java의 정석 1", "남궁성");
        library[3] = new Book("Java의 정석 2", "남궁성");
        library[4] = new Book("스프링5 프로그래밍 입문", "최병균");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println();
    }

}
