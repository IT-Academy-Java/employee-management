package domain;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String name;
    private String surname;
    private String job;
    private static int nextuniqueID = 0;
    private int ID;

    public Employee(){
        nextuniqueID++;
        ID = nextuniqueID;
    }

}
