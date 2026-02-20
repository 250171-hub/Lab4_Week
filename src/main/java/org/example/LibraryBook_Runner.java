package org.example;

public class LibraryBook_Runner {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook();
        book1.setPages(501);
        System.out.println(book1.getPages());
        System.out.println(book1.isThick());
        book2.setPages(-10);
        System.out.println(book2.getPages());
    }

    }

