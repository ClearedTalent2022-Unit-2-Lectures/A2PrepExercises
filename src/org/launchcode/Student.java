package org.launchcode;

public class Student extends Person {
    private TeachingAssistant taGroup;

    public Student(String firstName, String lastName, TeachingAssistant taGroup) {
        super(firstName, lastName);
        this.taGroup = taGroup;
    }

    public TeachingAssistant getTaGroup() {
        return taGroup;
    }

    public void setTaGroup(TeachingAssistant taGroup) {
        this.taGroup = taGroup;
    }
}
