package Lesson1;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearPublication;
    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.authorBook = author;
        this.yearPublication =year;
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
    public String getFullInfoBook() {
        return nameBook+", "+authorBook.getName()+", Год издания "+yearPublication;
    }
    public void setYearPublication(int year) {
        this.yearPublication = year;
    }
}

