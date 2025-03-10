package org.launchcode;

public class Teacher {
    //FIELDS
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //CONSTRUCTOR
    public Teacher (String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject= subject;
        this.yearsTeaching = yearsTeaching;
    }

    // SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }

    //GETTERS
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }

}
