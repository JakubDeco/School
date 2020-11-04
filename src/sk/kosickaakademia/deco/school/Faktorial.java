package sk.kosickaakademia.deco.school;

public class Faktorial {
    public static int faktorialCisla(int x){//recursive method
        int sum;
        if (x==1)sum=x;
        else sum=x*faktorialCisla(x-1);
        return sum;
    }
}
