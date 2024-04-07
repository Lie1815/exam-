package bookshelf;
import bookshelf.books.Author;
import bookshelf.books.Book;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        author1.name = "John";
        author1.surname = "Thompson";

        System.out.println(author2.name);
        System.out.println(author2.surname);

        author1.name = "John";
        author1.surname = "Thompson";

        System.out.println(author2.name);
        System.out.println(author2.surname);
        Book book1 = new Book("название книги", "автор книги");
        System.out.println(book1);
        book1.setPagecount(22);
        System.out.println(book1.getPageCount());
        book1.setAuthor(author1);
    }

}

