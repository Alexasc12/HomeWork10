package Homework10;

import java.util.Objects;

public class Book {
    String nameBook;
    String name;
    int year;




    public String getNameBook() {
        return nameBook;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;

    }
    public String toString() {
        return name+", "+ nameBook+ " ," +year;
    }


    public Book(String name, String nameBook, int year) {
        this.name = name;
        this.nameBook = nameBook;
        this.year = year;
    }

    public boolean equals(Object Book1) {
        if (this.getClass() != Book1.getClass()) {
            return false;
        }
        Book Book2 = (Book) Book1;
        return nameBook.equals(Book2.nameBook);
    }
    @Override
    public int hashCode() {
       return Objects.hash(nameBook);
   }


    }




