package com.company;

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
}
