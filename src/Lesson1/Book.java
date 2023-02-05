package Lesson1;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearPublication;
    public static int size = 0;
    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.authorBook = author;
        this.yearPublication =year;
        size ++;
    }
    public String getNameBook() {
        return nameBook;
    }
    public Author getAuthorBook() {
        return authorBook;
    }
    public int getYearPublication() {
        return yearPublication;
    }

    public int getSize() {
        return size;
    }
    public void setYearPublication(int year) {
        this.yearPublication = year;
    }
    @Override
    public String toString() {
        return nameBook+", "+authorBook.getName()+", Год издания "+yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && nameBook.equals(book.nameBook) && authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, yearPublication);
    }
}

