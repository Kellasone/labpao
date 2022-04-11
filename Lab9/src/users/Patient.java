package users;

public class Patient extends User{
    private String cnp;
    private String type;



    public Patient() {
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cnp='" + cnp + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    public Patient(int id, String name, int age, String cnp, String type) {
        super(id, name, age);
        this.cnp = cnp;
        this.type = type;
    }
}
