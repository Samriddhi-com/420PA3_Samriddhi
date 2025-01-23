package com.modelClass;

import java.util.ArrayList;
import java.util.List;

class Books {
    private String title;
    private String author;


    // Constructor
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
 class Library {
     private List<Books> books;

     public Library() {
         books = new ArrayList<>();
     }

     public boolean addBook(Books book) {
         for (Books b : books) {
             if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                 return false; // Book already exists
             }
         }
         books.add(book);
         return true; // Book added successfully
     }

     public boolean removeBook(String title) {
         for (Books b : books) {
             if (b.getTitle().equalsIgnoreCase(title)) {
                 books.remove(b);
                 return true; // Book removed
             }
         }
         return false; // Book not found
     }

     // SearchBook method
     public Books searchBook(String title) {
         for (Books b : books) {
             if (b.getTitle().equalsIgnoreCase(title)) {
                 return b; // Book found
             }
         }
         return null;
     }

}
