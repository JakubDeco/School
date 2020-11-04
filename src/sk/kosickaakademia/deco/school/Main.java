package sk.kosickaakademia.deco.school;

import sk.kosickaakademia.deco.school.animal.Dog;
import sk.kosickaakademia.deco.school.animal.Fish;
import sk.kosickaakademia.deco.school.animal.Pet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Student[] students=createStudents();
        printStudents(students);
        System.out.println(students[2].getGrades().calcAvg());
        sortByAvg(students);
        printStudents(students);
        printClassOfStudents(students,ClassName.N2);

        System.out.println();
        addPets(students);
    }
    //todo
    /*public static void createHobbies(Student students){
        students[0]
    }*/
    public static void addPets(Student[] students){
        Pet p1=new Fish(5);
        students[0].setPet(p1);

        Pet p3=new Dog("Dunco");
        students[2].setPet(p3);
    }

    public static void printClassOfStudents(Student[] s,ClassName className){
        System.out.println("___________________________________________");
        System.out.println("List of students of "+className+":");
        for (int i = 0; i < s.length; i++) {
            if (s[i].getClassName()==className){
                s[i].printStudent();
            }
        }
    }

    public static void sortByAvg(Student[] students){
        Student[] help=new Student[1];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length -1 - i; j++) {
                if (students[j].getGrades().calcAvg() > students[j+1].getGrades().calcAvg()){
                    help[0]=students[j];
                    students[j]=students[j+1];
                    students[j+1]=help[0];
                }
            }
        }
    }

    public static void printStudents(Student[] students){
        System.out.println("List of students:");
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }
    }

    public static Student[] createStudents(){
        Student[] students=new Student[10];

        Grades g1=new Grades(2,2,1);
        Student student1=new Student("Adam","Solar",createDob("1996-12-23"),ClassName.N1,g1,1650);
        students[0]=student1;

        Grades g2=new Grades(4,1,3);
        Student student2=new Student("Karol","Juha",createDob("1989-2-19"),ClassName.N2,g1,1230);
        students[1]=student2;

        Grades g3=new Grades(1,2,1);
        Student student3=new Student("Natalia","Siroka",createDob("1997-6-21"),ClassName.N3,g3,1490);
        students[2]=student3;

        Grades g4=new Grades(1,1,2);
        Student student4=new Student("Lukas","Sikor",createDob("2000-9-25"),ClassName.N2,g4);
        students[3]=student4;

        Grades g5=new Grades(3,2,1);
        Student student5=new Student("Kamila","Topecka",createDob("1998-9-2"),ClassName.N2,g5);
        students[4]=student5;

        Grades g6=new Grades(2,2,1);
        Student student6=new Student("Simon","Utokel",createDob("1994-11-17"),ClassName.N3,g6,1750);
        students[5]=student6;

        Grades g7=new Grades(1,1,1);
        Student student7=new Student("Ema","Rekova",createDob("1990-10-26"),ClassName.N3,g7,1920);
        students[6]=student7;

        Grades g8=new Grades(3,1,2);
        Student student8=new Student("Jana","Iskeraliova",createDob("1999-1-20"),ClassName.N1,g8);
        students[7]=student8;

        Grades g9=new Grades(2,4,3);
        Student student9=new Student("Rene","Nutola",createDob("1992-3-6"),ClassName.N2,g9,1230);
        students[8]=student9;

        Grades g10=new Grades(1,2,1);
        Student student10=new Student("Anna","Lurovska",createDob("1991-11-2"),ClassName.N3,g10,1320);
        students[9]=student10;

        return students;
    }

    public static Date createDob(String dob){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try{
            return sdf.parse(dob);
        }catch (java.text.ParseException e){
            e.printStackTrace();
        }
        return null;
    }
}
