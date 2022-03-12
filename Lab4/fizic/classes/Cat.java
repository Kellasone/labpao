package classes;

public class Cat extends Animal{
    String ceva;
    public Cat() {
    }

    public Cat(String ceva) {
        this.ceva = ceva;
    }

    public Cat(String name, int age, String ceva) {
        super(name, age);
        this.ceva = ceva;
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a cat");
    }
    public void whoAmI(int age){
        System.out.println("I am a cat, and I am "+ age+" years old.");
    }

    public void whoAmI(String age){
        System.out.println("I am a cat, and I am "+ age+" years old.");
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void nothing(){
        System.out.println("test");
    }
}
