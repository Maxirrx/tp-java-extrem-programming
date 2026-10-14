package fr.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();



    public void addBook(Book book) {
        boolean exist = false;
        for(Book book1 : this.books){
            if(book1.equals(book)){
                exist = true;
                System.out.println("L'isbn existe déjà dans la bibliothèques on ne l'insert pas \n");
            }
        }
        if(!exist){
            this.books.add(book);
        }
    }

    public void removeBook(Book book){
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i) == book){
                this.books.remove(i);
            }
        }
    }

    public boolean containsIsbn(String isbn){
        for(Book book : this.books){
            if(book.getIsbn() == isbn){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.books.size();
    }

    public void displayBooks() {
        for(Book book : this.books){
            System.out.println(book.toString());
        }
    }

    public Book findByTitle(String name){
        for(Book book : this.books){
            if(book.getTitle() == name){
                return book;
            }
        }
        return null;
    }

    public Book findByIsnb(String isbn){
        for(Book book : this.books){
            if(book.getIsbn() == isbn){
                return book;
            }
        }
        return null;
    }

    public Book findByAuthor(String author){
        for(Book book : this.books){
            if(book.getAuthor() == author){
                return book;
            }
        }
        return null;
    }

}
