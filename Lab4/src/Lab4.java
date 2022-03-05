import classes_package.DailyCustomer;
import classes_package.McLarenCustomer;
import classes_package.WeeklyCustomer;

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
        //This exemplify that we cannot access the private field, but we can access the public methot that manipulate the private field, inside that class

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
        // The method has the same name but diferent parameters
        //Lets try one more
        ohHoney.whoAmI(16);

    }
}
