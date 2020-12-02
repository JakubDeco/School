package sk.kosickaakademia.deco.school;

public class Recursive {
    public static int faktorialCisla(int x){//recursive method
        int sum;
        if (x==1)sum=x;
        else sum=x*faktorialCisla(x-1);
        return sum;
    }

    public static double sumUnderLine(double x){
        if (1/x<0.01){
            return 1/x;
        }
        else return 1/x+sumUnderLine(x+1);
    }
}
