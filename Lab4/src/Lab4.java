import classes_package.*;

/*
*
* Main class
*
*/
public class Lab4 {

    public static void main(String[] args) {
        //Default constructor for the base class
        McLarenCustomer mcLarenCustomer = new McLarenCustomer();

        //Verify the class of this object
        System.out.println(mcLarenCustomer.getClass().getName());

        //Lets test the constructor with all parameters
        McLarenCustomer theRealMcLarenCustomer = new McLarenCustomer("Customer Name", 3, "Useless String because with not");

        //Lets see if we can access the fields (not using the getters)
        System.out.println(theRealMcLarenCustomer.name);
        System.out.println(theRealMcLarenCustomer.averageTip);
//        System.out.println(theRealMcLarenCustomer.uselessField);
        //This is commented because it will trigger a compilation error. Delete the double slash to check it

        //As we can see, we cannot access the private field, out of the class. But look at the following black magic:
        System.out.println(theRealMcLarenCustomer.getUselessField());
        //This exemplify that we cannot access the private field, but we can access the public method that manipulate the private field, inside that class

        System.out.println("\n\n\n");

        //Lets have some fun with the subclasses
        DailyCustomer ted = new DailyCustomer();
        //We can see in the console how is called the superclass constructor
        System.out.println("ted is " + ted.getClass());

        System.out.println("\n\n\n");

        DailyCustomer barney = new DailyCustomer("Barney Stinson", 20,  "Barney is awesome!", 20);
        //This shows us the fact that the superclass constructor is called when we are trying to instantiate a subclass object.
        // But, as default, the constructor without parameters is called.


        System.out.println("\n\n\n");

        ted.whoAmI();
        barney.whoAmI();

        WeeklyCustomer ohHoney = new WeeklyCustomer();
        ohHoney.setName("Oh honeeeeeeeeeey");
        ohHoney.whoAmI();
        //This shows us that a subclass can override a superclass method and change its behaviour
        ohHoney.whoAmI("beer");
        //This shows us that a subclass can overload a superclass method and change its behaviour based on number of parameters.
        // The method has the same name but different parameters
        //Lets try one more
        ohHoney.whoAmI(16);


        //upcasting / downcasting

        //Real Type: WeeklyCustomer; Declared Type: McLarenCustomer
        McLarenCustomer upcasted = new WeeklyCustomer();
        System.out.println(upcasted.getClass());

        //The Declared type will tell us what methods we can access, but the real type will determines which implementation to be used
        //For example: in both classes, we have the method whoAmI. Because the declared type, McLarenCustomer, has this method, we can use it, but because
        //real type has its own implementation, we will receive the string from the real type

        upcasted.whoAmI();

        //Buuuuuuut, because the declared type has no method whoAmI with parameters, even though the real type has them, they cannot be called.
        //Decomment the following line to see what is happening
        //upcasted.whoAmI(3);


        //Downcasting an object should be realized on an object that real type is already the child class .
        // "You cannot directly cast superclass to subclass because that object was never a subclass"
        WeeklyCustomer downcasted = (WeeklyCustomer) upcasted;
        System.out.println(downcasted.getClass());

        //abstract classes
        //An abstract class cannot be instantiated
//        AbstractClass ac = new AbstractClass();

        //Abstract methods from the abstract class MUST be implemented by the subclass.
        AbstractClassImpl aci = new AbstractClassImpl();
        aci.method();

    }
}
