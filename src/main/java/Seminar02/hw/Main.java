package org.example.hw;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Иванов И";
        Student st2 = new Student();
        st2.name = "Петров П";

        Book book1 = new Book("книга 1", "автор 1");
        Book book2 = new Book("книга 2", "автор 2");
        Book book3 = new Book("книга 3", "автор 3");
        Book book4 = new Book("книга4","автор4");

        Library library = new Library();
        library.fillLibrary(book1);
        library.fillLibrary(book2);
        library.fillLibrary(book3);
        library.fillLibrary(book4);
        library.takebook(st1,book3);
        library.takebook(st1,book2);
        library.takebook(st1,book1);
        System.out.println(library.takenBooksByStudent(st1));

        library.returnbook(book2);

        library.takebook(st2,book2);

        System.out.println(library.takenBooksByStudent(st1));

        System.out.println(library.takenBooksByStudent(st2));


        library.takebook(st2,book1);

        System.out.println(library.takenBooksByStudent(st2));
        library.printLibrary();

    }
}