package sk.kosickaakademia.deco.school;

import java.util.Date;

public class Student {
    //variables
    private String fName;
    private String lName;
    private Date dob;
    private ClassName className;
    private Grades grades;
    private double salary;

    //methods
    public Student(String fName,String lName,Date dob,ClassName className,Grades grades,double salary){
        this.fName=fName;
        this.lName=lName;
        this.dob=dob;
        this.className=className;
        this.grades=grades;
        this.salary=salary;
    }
    public Student(String fName,String lName,ClassName className,Grades grades){
        this.fName=fName;
        this.lName=lName;
        this.className=className;
        this.grades=grades;
    }

    public String getFName() {
        return fName;
    }
    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }
    public void setLName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public ClassName getClassName() {
        return className;
    }
    public void setClassName(ClassName className) {
        this.className = className;
    }

    public Grades getGrades() {
        return grades;
    }
    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
