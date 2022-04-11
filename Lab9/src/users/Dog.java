package users;

public class Dog extends User {
    private String breed;
    private int cutenessLevel;

    public Dog(int id, String name, int age, String breed, int cutenessLevel) {
        super(id, name, age);
        this.breed = breed;
        this.cutenessLevel = cutenessLevel;
    }

    public Dog() {
    }

    public int getCutenessLevel() {
        return cutenessLevel;
    }

    public void setCutenessLevel(int cutenessLevel) {
        this.cutenessLevel = cutenessLevel;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", cutenessLevel=" + cutenessLevel +
                "} " + super.toString();
    }
}
