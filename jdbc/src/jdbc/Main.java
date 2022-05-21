package jdbc;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        Cat firstCat = db.getCatById(1);
        Cat customCat = db.getSpecialCat(2,"cat2name");
        System.out.println(customCat);
    }
}
