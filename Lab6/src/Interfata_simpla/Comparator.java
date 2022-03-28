package Interfata_simpla;

public class Comparator implements java.util.Comparator<Caine> {
    @Override
    public int compare(Caine o1, Caine o2) {


            if (o1.varsta < o2.varsta)
                return -1;
            else if (o1.varsta > o2.varsta)
                return 1;
            else return 0;

    }
}
