package classes;

public class Animal {
    public String name;
    public int age;
    private String useless;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUseless() {
        return useless;
    }

    public void setUseless(String useless) {
        this.useless = useless;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", useless='" + useless + '\'' +
                '}';
    }

    public void whoAmI(){
        System.out.println("I am an animal");
    }

    public void eat(){
        System.out.println("I am an animal and I am eating ");
    }
}
