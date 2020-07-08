package domain;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String surname;
    private String job;
    private static int nextuniqueID = 0;
    private int ID;

    public Employee(){
        nextuniqueID++;
        ID = nextuniqueID;
    }

    public Employee(String name, String surname, String job){
        this.name = name;
        this.surname = surname;
        this.job = job;
        nextuniqueID++;
        ID = nextuniqueID;
    }

}
