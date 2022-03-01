package com.company;

import java.util.Objects;

public class Book {
        private final String bookName;
        private final Author author;
        private int year;

    public Book(String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
        }

    public String getBookName() {
        return bookName;}

    public Author getAuthor() {
        return author;}

    public int getYear() {
        return year;}

    public void setYear(int year) {
        this.year = year;
        }
    public String toString(){
        return "Book {" +
                "book name - " + bookName +
                ", author - " + author +
                ", year published " + year +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author) && year == book.year;

    }

    public int hashCode() {
        return Objects.hash(bookName, author, year);
    }
}
