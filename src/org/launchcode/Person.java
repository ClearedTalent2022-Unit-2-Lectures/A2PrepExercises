package org.launchcode;

public abstract class Person {
    private int id;
    // This nextId static property is great for giving each new Person
    // its own unique id. Based on the code in the first constructor on line
    // 12, when you create a new Person object, the id field will be set to whatever
    // nextId currently is, which is 1 to start. Then, nextId iterates up by 1.
    // Then when you create another Person object, it will get an id of 2, and nextId
    // will again iterate up by 1. That way, the id of Person objects is now automatically
    // being handled.
    private static int nextId = 1;

    private String firstName;
    private String lastName;

    public Person() {
        id = nextId;
        nextId++;
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
