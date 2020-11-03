package sk.kosickaakademia.deco.school;

public class Grades {
    //variables
    private int mat,eng,pro;

    //methods

    public Grades(int mat,int eng,int pro){
        this.mat=mat;
        this.eng=eng;
        this.pro=pro;
    }

    public int getMat() {
        return mat;
    }

    public int getEng() {
        return eng;
    }
    public int getPro() {
        return pro;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setPro(int pro) {
        this.pro = pro;
    }
    public String toString(){
        return "Mat: "+mat+" Eng: "+eng+" Pro: "+pro;
    }

    public double calcAvg() {
        return (mat+eng+pro)/3.0;
    }
}
