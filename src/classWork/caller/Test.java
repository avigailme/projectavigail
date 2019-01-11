package classWork.caller;

import classWork.library.BookOne;

public class Test {
    public static void main(String[] args) {
        BookOne bookOne = new BookOne("Tolstoy","Voina i mir","1");
        //bookOne.setAuthor("Lermontov");
       // bookOne.setNumOfpages(200);
        System.out.println(bookOne);
        bookOne.correctChangeBook("Tolstoy", "Viona i mir", 200, "2");

    }
}
