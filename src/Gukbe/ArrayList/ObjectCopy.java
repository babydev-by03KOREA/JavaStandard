package Gukbe.ArrayList;

public class ObjectCopy {
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

//      맨 위에 두어야 반영됩니다! 참고하는 주소는 같기때문에 같이 바뀌게 됩니다.
        library[4].setAuthor("윤인성");
        library[4].setTitle("HTML5 + CSS3 바이블 3판");

        System.out.println("===== library =====");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        /* library에서 0 부터 copyLibrary에다 0부터 총 5개를 복사해주세요. */

        System.out.println("===== copy library =====");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

    }
}
