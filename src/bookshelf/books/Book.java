package bookshelf.books;

import java.util.Scanner;

public class Book {
    private String title;
    private int pageCount;
    private Author author;
    public Book(String названиеКниги, String авторКниги) {
        this.title = title;
    }
    public void setPagecount(int count){
        do {
            try {
                if (pageCount > 0){
                    throw new IllegalArgumentException("Количество страниц не может быть отрицательным. Пожалуйста, введите корректное значение.");
                }
                this.pageCount = pageCount;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
              //  pageCount = requestPageCountFromUser();
            }

                if (count < 10 ) {
                    throw  new IllegalArgumentException("знач не может быть меньше 10");
                }
                pageCount = count;
            } while (pageCount < 0);{
       // System.out.println("Ошибка: " + e.getMessage());
        System.out.println("Пожалуйста, введите корректное кол-во страниц:");
        Scanner scanner = new Scanner(System.in);
        int newPageCount = scanner.nextInt();

        }

    //private int requestPageCountFromUser() {
       // return 0;
    }

    public int getPageCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество страниц в книге: ");
        return scanner.nextInt();
    }

    public void setAuthor(Author author) {
        if(author == null){
            throw new IllegalArgumentException("author не может быть null");
        }
        this.author = author;
    }

}

