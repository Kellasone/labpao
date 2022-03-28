package Interfata_simpla;

public interface Animal {
    int varsta=0;
    void eat();
    public default void something(){
        System.out.println("ceva");
    }

}
