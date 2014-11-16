package model;

/**
 * Created by fabricesnajdermann on 18/10/14.
 */
public class Contact {

    private String name;
    private String lastname;
    private int age;

    public Contact(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public String lastname() {
        return lastname;
    }

    public int age() {
        return age;
    }
}
