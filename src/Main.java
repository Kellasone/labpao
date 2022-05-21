import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        printThing(exclamare -> "Miau" + exclamare);
        ArrayList<Person> people = new ArrayList<>();

        Predicate<Person> criteriu = p -> p.getId() > 5;
        Person person1 = new Person("nume", 6);
         Person person2 = new Person ("nume1", 16);
         Person person3 = new Person("nume", 2);
         Person person4 = new Person("nume", 4);
        Person person5 = new Person ("nume1", 11);
        Person person6 = new Person("nume", 9);
        Person person7 = new Person("nume", 2);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);

            // SORTED (2 IMPLEMENTARI), map, flatMap
        people.stream().forEach(System.out::println);
        System.out.println("----------");
        people = (ArrayList<Person>) people.stream()
                .sorted((p1, p2) -> {if(p1.getId()< p2.getId()) return -1; if(p1.getId() > p2.getId()) return 1; return 0;})
                .collect(Collectors.toList());
        people.stream().forEach(System.out::println);
    }
//    static void printThing(Printable ceva){
//        String output = ceva.print("!!");
//        System.out.println(output);
//    }
}
