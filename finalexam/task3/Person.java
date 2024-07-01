package finalexam.task3;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String personalNumber;

    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // getters and setters
    // ...
}