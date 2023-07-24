package Seminar02.hw;

import java.util.List;

public interface LibraryBehavior {
    void takebook(Student student, Book book);
    void returnbook(Book book);
    List<Book> takenBooksByStudent(Student student);

}
