public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println(book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " - " + book1.getTitle() + " (" + book1.getYear() + ")");
        System.out.println(book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " - " + book2.getTitle() + " (" + book2.getYear() + ")");

        book1.setYear(1873);
        System.out.println(book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " - " + book1.getTitle() + " (" + book1.getYear() + ")");
    }
}