package tr.edu.medipol.yazarac.RestWebServisOrnek;

 

public class Student {

 

    private String name;
    private int number;
    
    public Student(String name, int number) {
        super();
        this.name = name;
        this.number = number;
    }

 

    public String getName() {
        return name;
    }

 

    public int getNumber() {
        return number;
    }

 

}