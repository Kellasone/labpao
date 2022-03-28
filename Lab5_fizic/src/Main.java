import classes.Car;
import classes.Driver;
import classes.TestRecord;

public class Main {
    public static void main(String[] args) {
//        Car c1;
//        Driver d1 = new Driver("Ion");
//        c1 = new Car ("neagra", d1, "10");
//        String a = "ceva";
//        String a = new String("ceva");
//        a.intern();
//        String a1;
//        a1 = a + " altceva";
//        StringBuilder b = new StringBuilder("inca ceva");
////        b.append(" something");
//        String pestetot = "umplutura";
//        String ata = "  UMPL Utura   "; //2 spatii la inceput, 3 spatii la final
//
////        System.out.println(cevreaueu.length());
//        System.out.println(pestetot.substring(1));
//        System.out.println(pestetot.substring(1, 4));
//        System.out.println(pestetot.charAt(8));
//        System.out.println(ata.compareTo(pestetot));
//        System.out.println(ata.compareToIgnoreCase(pestetot));
//        String ceva = ata.toLowerCase();
//        System.out.println(ceva);
//        System.out.println(ata.toUpperCase());
//        System.out.println(ata.trim());
//        System.out.println(1);
//        System.out.println(String.valueOf(1));
//        System.out.println(ata.startsWith("PL ",4)); //sunt 2 spatii aici
//        System.out.println(ata.endsWith("a   ")); //sunt 3 spatii aici
////        System.out.println(nr_telefon.matches("^0")); //regex101.com
//        String propozitie = "imi.plac.merele";
//        String[] denumire = propozitie.split("m");
//        System.out.println(denumire[2]);
        //propozitie.replace(regex: ) to be continued
        StringBuilder string = new StringBuilder("valoare");
        System.out.println(string);
        string.append(" mare");
        System.out.println(string);
        string.insert(0, "o ");
        System.out.println(string);
        string.delete(0,2);
        System.out.println(string);
        string.replace(0, 2, "Va");
        System.out.println(string);
        TestRecord denumireRecord = new TestRecord("parametru", "parametru2");
        System.out.println(denumireRecord.ceva());
        System.out.println(denumireRecord.altceva());
    }
}
