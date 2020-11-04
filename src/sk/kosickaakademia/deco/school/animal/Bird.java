package sk.kosickaakademia.deco.school.animal;

public class Bird implements Pet {
    private String name;

    public Bird(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
