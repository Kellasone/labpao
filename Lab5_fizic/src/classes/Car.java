package classes;

public class Car {
    String culoare;
    Driver driver;
    Engine engine;

    public Car(String culoare, Driver driver, String turatie) {
        this.culoare = culoare;
        this.driver = driver;
        this.engine = new Engine(turatie);
    }
}
