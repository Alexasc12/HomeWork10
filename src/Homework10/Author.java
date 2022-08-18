package Homework10;

public class Author {
    String name ;
    String familia ;


    public String getname() {
        return name;
    }

    public String getFamilia() {
        return familia;
    }
    public String toString() {
        return name+", "+familia;
    }

    public Author(String name, String familia) {
        this.name = name;
        this.familia = familia;
    }
    public boolean equals(Object Author1) {
        if(this.getClass() != Author1.getClass()){
           return false;
        }Author Author2 = (Author) Author1;
        return name.equals(Author2.name);
    }


}


