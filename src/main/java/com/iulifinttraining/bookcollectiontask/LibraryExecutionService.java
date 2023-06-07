package com.iulifinttraining.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {

    public static void main(String[] args) {
        Book book1984 = new Book("1984","George O.");
        Book bookBiology = new Book("Biology","Martin L.");
        Book bookOamenii = new Book("Oamenii Fericiti nu lucreaza si beau cafea","Martin L.");
        Book bookIon = new Book("ION","Liviu Rebreanu");

        System.out.println(bookIon.getTitle());

        Library classsicLibrary = new Library("Librarius");
        classsicLibrary.addBooksToLibrary(book1984);
        classsicLibrary.addBooksToLibrary(bookOamenii,bookBiology);

        System.out.println("1. Numarul de carti in biblioteca: " + classsicLibrary.getName() + " este: " + classsicLibrary.returnNumberOfBooks());
        classsicLibrary.printAllBooks();

        classsicLibrary.removeBook(2);

        System.out.println("2. Numarul de carti dupa stergere este: " + classsicLibrary.returnNumberOfBooks());

        classsicLibrary.removeBook(bookIon);

        System.out.println("3. Numarul de carti dupa stergere este: " + classsicLibrary.returnNumberOfBooks());

        classsicLibrary.removeBook("Oamenii Fericiti nu lucreaza si beau cafea");
        System.out.println("4. Numarul de carti dupa stergere este: " + classsicLibrary.returnNumberOfBooks());

        boolean oameniiBookExists = classsicLibrary.doesTheBookExist(bookOamenii);
        if (oameniiBookExists) {
            System.out.println("The book: " + bookOamenii.getTitle() + " exists.");
        } else System.out.println("The book: " + bookOamenii.getTitle() + " does not exist.");

        Library literaLibrary = new Library("Litera");

        literaLibrary.addBooksToLibrary(bookIon);
        literaLibrary.addBooksToLibrary(bookOamenii,book1984);

        literaLibrary.printAllBooks();

        Map<String,Library> librariesNetwork = new HashMap<>();
        librariesNetwork.put("str. Arborilor 22",classsicLibrary);
        librariesNetwork.put("str. Vieru 14",literaLibrary);

        librariesNetwork.get("str. Vieru 14").addBooksToLibrary(bookBiology);
        librariesNetwork.get("str. Arborilor 22").printAllBooks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListIntoLibraryList(literaLibrary.getBookList());
        librariesNetwork.get("str. Arborilor 22").printAllBooks();


    }
}
