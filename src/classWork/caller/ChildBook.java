package classWork.caller;


import classWork.library.BookOne;

public class ChildBook extends BookOne {
    public static void main(String[] args) {
       ChildBook childBook = new ChildBook();
       childBook.needToRepair=true;
    }
}
