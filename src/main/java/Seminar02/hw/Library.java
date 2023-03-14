package org.example.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library implements LibraryBehavior {
    List<Book> library = new ArrayList<>();
public void fillLibrary(Book book){
    library.add(book);
}


    Map<Book, Student> lib = new HashMap<>();

public void printLibrary(){
    for (Map.Entry<Book,Student> pair: lib.entrySet()){
        System.out.println(pair.getKey().name + " у студента " + pair.getValue().getName());
    }
    }


    public void takebook(Student student, Book book) {
        boolean flag = true;
        for (Map.Entry<Book, Student> item : lib.entrySet()) {
            if (book.equals(item.getKey())) {
                flag = false;
            }
        }
        lib.putIfAbsent(book, student);
        if (flag == true)
            System.out.println("Студент " + student.getName() + " взял книгу " + book.name + " " + book.author);
        else System.out.println("Студент " + student.getName() + " запросил " + book.name +"\n Эта книга уже выдана");
    }


    public void returnbook(Book book) {
        System.out.println("Студент " + lib.get(book).getName() + " вернул книгу " + book.name + " " + book.author);
        lib.remove(book);
    }

    /**
     *
     * @param st студент
     * @return список книг, взятых студентом
     */
    public List<Book> takenBooksByStudent(Student st) {
        List<Book> takenByStudent = new ArrayList<>();
        for (Map.Entry<Book, Student> item : lib.entrySet()) {
            if (st.equals(item.getValue())) {
                takenByStudent.add(item.getKey());
            }
        }
        return takenByStudent;
    }
}






