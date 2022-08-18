package Homework10;

import Homework10.Author;
import Homework10.Book;

public class Main {
    public static void main(String[] args) {
        Book Book1 = new Book("Кошки и собаки", "Федя", 2012);
        Book1. getNameBook();
        Book1. getName();
        Book1.setYear(2012);
        System.out.println(Book1);


        Book Book2 = new Book("Лечение животных","Федя", 2006);
        Book2. getNameBook();
        Book2. getName();
        Book2.setYear(2011);
        System.out.println(Book2);
                System.out.println(Book1.equals(Book2));


        Book Book3 = new Book("Война и мир", "Пушкин А.С.", 1899);
        System.out.println(Book3);

        Author Author1 = new Author("Федор","Достоевский");
        Author1.getname();
        Author1.getFamilia();
        System.out.println(Author1);

        Author Author2 = new Author("Александр", "Пушкин");
        Author2.getname();
        Author2.getFamilia();
        System.out.println(Author2);
        System.out.println(Author2.equals(Author1));
        System.out.println(Book1);
        System.out.println( Book.a);
















    }


}

