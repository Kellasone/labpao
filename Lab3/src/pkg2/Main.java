package pkg2;

import pkg2.test.Lab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int g[][] = new int[5][];
//        for(int i =0;i< g.length;i++){
//            g[i] = new int[3];
//        }
//
//
//        System.out.println(Arrays.deepToString(g));

//       static void fill(Tip[] tablou, Tip valoare)
//        int v[] = new int[5];
//        int x[] = new int[5];
//        System.out.println(Arrays.toString(v));
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.equals(x, v));
//
//
//        Arrays.fill(v, 5);
//        System.out.println(Arrays.toString(v));
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.equals(x, v));



//       static boolean equals(Tip[] a, Tip[] b) –
//       verifică dacă tablourile a și b sunt egale, respectiv dacă au
//       același număr de elemente și elementele aflate pe aceleași poziții
//       sunt egale.


//       static boolean deepEquals(Tip[] a, Tip[] b) – verifică în profunzime dacă tablourile a și b sunt egale, respectiv dacă elementele lor sunt tot tablouri le verifică egalitatea din punct de vedere al lungimilor și al elementelor aflate pe același poziții, ci nu al referințelor.
//static int mismatch(Tip[] a, Tip[] b) – returnează cel mai mic indice k pentru care a[k] ≠ b[k] sau -1 dacă tablourile sunt egale. Dacă tablourile a și b nu sunt egale, atunci valoarea indicelui k este cuprinsă între 0 și minimul dintre lungimile celor două tablouri a și b.


        Lab lab = new Lab(5, "21");
        lab.getDurata();

    }
}
