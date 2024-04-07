package bookshelf.books;
import java.util.Arrays;
public class Shelf {
    private String color = "белый";
    private Book[] books; // книги на полке

    public void addBook(Book book){
        for (int i = 0; i < books.length; i+= 1) { // перебираем массив книг на полке
            if (books[i] == null) { // если элемент равен null,
                books[i] = book; // значит в массив можно передать ссылку на книгу
                return; // и прервать метод, чтобы ссылка не заполнила весь массив
            }
        }
        //System.out.println("Книге автора " + book.getFullName() + " не хватило места на полке ");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

}


