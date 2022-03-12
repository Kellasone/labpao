package classes;

public class Dog extends Animal{
    String breed;

    public String getBreed() {
        return breed;
    }

    public Dog() {
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
