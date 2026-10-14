package fr.library;

import static java.util.Collections.replaceAll;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int year;

    public Book(String isbn,String title, String author, int year) {
        if (checkIsbn(isbn)) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.year = year;
        }else{
            throw new IllegalArgumentException("Le numéro isbn n'est pas good");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object book1){
        Book book = (Book) book1;
        return (book.getIsbn() == this.isbn) ? true :  false;
    }


    public boolean checkIsbn(String isbn){
        return (isbn.length() == 13 && isbn != null && isbn.replaceAll("\\s+","")
                != "") ? true : false;

    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
