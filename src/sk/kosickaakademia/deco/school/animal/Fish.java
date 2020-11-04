package sk.kosickaakademia.deco.school.animal;

public class Fish implements Pet {
    private int count;

    public Fish(int count){
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
