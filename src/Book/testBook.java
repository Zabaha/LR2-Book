package Book;

public class testBook {

    public static void main(String[] args) {
        Book b1 = new Book("Скотный двор", "антиутопия", "Джордж Оруэлл", 1945, 128);
        System.out.println(b1);
        Book b2 = new Book();
        b2.setTitle("Мертвые души");
        b2.setGenre("роман");
        b2.setAuthor("Николай Гоголь");
        b2.setYearOfPublishing(1842);
        b2.setNumberOfPages(352);
        System.out.println(b2);
    }
}
