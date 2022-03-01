package com.company;

public class Main {

public static void main(String[] args) {
    Book firstBook = new Book("Master and Margarita", new Author("Mikhail", "Bulgakov"),1766);
    Book secondBook = new Book("Crime and Punishment", new Author("Fyodor", "Dostoevsky"),1866);
    firstBook.setYear(1966);
    System.out.println(firstBook);
    System.out.println(secondBook);
}
}
