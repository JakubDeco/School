package sk.kosickaakademia.deco.school;

import sk.kosickaakademia.deco.school.animal.Pet;
import sk.kosickaakademia.deco.school.hobby.Hobby;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    //variables
    private String fName;
    private String lName;
    private Date dob;
    private ClassName className;
    private Grades grades;
    private double salary;
    private Hobby[] hobbies=new Hobby[5];
    private Pet pet=null;/*java sets null as default but other languages might not.
    Thus it isn't bad putting it in manually or just keeping it in mind*/

    //methods
    public Student(String fName,String lName,Date dob,ClassName className,Grades grades,double salary){
        this.fName=fName;
        this.lName=lName;
        this.dob=dob;
        this.className=className;
        this.grades=grades;
        this.salary=salary;
    }
    public Student(String fName,String lName,Date dob,ClassName className,Grades grades){
        this.fName=fName;
        this.lName=lName;
        this.dob=dob;
        this.className=className;
        this.grades=grades;
    }

    public void setPet(Pet pet){
        this.pet=pet;
    }
    public Pet getPet() {
        return pet;
    }
    public void printPet(){
        if (pet!=null) System.out.println(pet.getClass().getSimpleName());
        else System.out.println("Does not have pet.");
    }


    //todo addHobies() by calling hobby constructor
    //public Hobby[] createHobbies(){}

    public void printHobbies(){
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]+" ");
        }
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

    public void printStudent(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fName+" "+lName+" "+sdf.format(dob)+" "+className);
    }
}
