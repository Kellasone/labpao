package Functii_generice;

public interface Suma {
    static int calcSuma(int n,Fg fg){
        int suma=0;
        for(int i=0;i<=n;i++)
        {
            suma+=fg.functie(i);
        }
        return suma;
    }
}
