package org.launchcode;

public class Instructor extends Person {
    private int numOfCoursesLead;

    public Instructor(String firstName, String lastName, int coursesLead) {
        super(firstName, lastName);
        this.numOfCoursesLead = coursesLead;
    }

    public int getNumOfCoursesLead() {
        return numOfCoursesLead;
    }

    public void setNumOfCoursesLead(int numOfCoursesLead) {
        this.numOfCoursesLead = numOfCoursesLead;
    }
}
