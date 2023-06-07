package com.iulifinttraining.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private String bookName;

    public Library(String name) {
        this.bookName = name;
        bookList = new ArrayList<>();
    }

    public String getName() {
        return bookName;
    }

    public void addBooksToLibrary(Book book) {
        if (book!=null) {
            bookList.add(book);
        }
    }

    public void addBooksToLibrary(Book book1, Book book2) {
        if (book1!=null && book2!=null) {
            bookList.add(book1);
            bookList.add(book2);
        }
    }

    public int returnNumberOfBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deletedBook = bookList.remove(elementPosition);
            System.out.println("The following Book was deleted: " + deletedBook.getTitle());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An exception has occured. Please review the index: " + e.getMessage());
        }

    }

    public void removeBook(Book removedBook) {
        boolean isDeleted = false;
        if (removedBook!=null) {
            isDeleted = bookList.remove(removedBook);
        }
        if (isDeleted) {
            System.out.println("The following book was deleted: " + removedBook.getTitle());
        } else {
            System.out.println("There is no such book in the library: " + removedBook.getTitle());
        }
    }

    public void removeBook(String bookTitle) {
        if (bookTitle!=null) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getTitle()==bookTitle) {
                    bookList.remove(i);
                    break;
                }
            }
        }
    }

    public boolean doesTheBookExist(Book book){
        return book!=null && bookList.contains(book);
    }

    public void printAllBooks(){
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("The book with nr: " + i + " with title: " + bookList.get(i).getTitle() + " by: " + bookList.get(i).getAuthor());

        }
    }

    public void addAnotherListIntoLibraryList(List<Book> anotherListOfBooks){
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}
