package pkg2.test;

public class Lab {
    public int durata;
    String locatie;

    private Lab(int durata, String locatie) {
        this.durata = durata;
        this.locatie = locatie;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
