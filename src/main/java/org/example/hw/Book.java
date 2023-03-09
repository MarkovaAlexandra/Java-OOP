package org.example.hw;

public class Book {
    public String name;
    public String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
