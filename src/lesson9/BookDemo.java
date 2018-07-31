package lesson9;

public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setAuthor("A");
        System.out.println(book1.getAuthor());

        book1.setAuthor("B");
        System.out.println(book1.getAuthor());


        Book book2= new Book();

        book2.setAuthor("X");
        System.out.println(book2.getAuthor());

        book2.setAuthor("Y");
        System.out.println(book2.getAuthor());
    }

}
