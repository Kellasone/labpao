package Interfata_simpla;

import java.util.Comparator;

public class Caine{
    int varsta = 0;

    public Caine(int varsta) {
        this.varsta = varsta;
    }

//    @Override
//    public int compareTo(Caine o) {
//        if (varsta < o.varsta)
//            return 1;
//        else if (varsta > o.varsta)
//            return -1;
//        else return 0;
//    }

    @Override
    public String toString() {
        return "Caine{" +
                "varsta=" + varsta +
                '}';
    }

//    @Override
//    public int compare(Caine o1, Caine o2) {
//        if (o1.varsta < o2.varsta)
//            return -1;
//        else if (o1.varsta > o2.varsta)
//            return 1;
//        else return 0;
//    }
}
