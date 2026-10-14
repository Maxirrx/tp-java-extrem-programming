package fr.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("9780132350884","Clean Code", "Robert Martin", 2008));
        library.addBook(new Book("9780134685991","Effective Java", "Joshua Bloch", 2018));
        library.addBook(new Book("9780184685991","Java pour les nuls", "Jules Grefet", 2018));
        library.addBook(new Book("9780185685991","Java pour les forts", "Maxime Roux", 2018));
        library.addBook(new Book("9780185685991","Java pour les forts", "Maxime Roux", 2018));

        Book book1 = library.findByTitle("Java pour les forts");
        Book book2 = library.findByIsnb("9780184685991");
        Book book3 = library.findByAuthor("Maxime Roux");
        int size = library.size();
        System.out.printf("La librairie compte %d livres \n\n", size);

        System.out.printf("Voici le livre trouvé par Titre %s \n\n", book1.toString());
        System.out.printf("Voici le livre trouvé par Isnb %s \n\n", book2.toString());
        System.out.printf("Voici le livre trouvé par Autheur %s \n\n", book3.toString());
        library.removeBook(book1);


        library.displayBooks();
    }
}
