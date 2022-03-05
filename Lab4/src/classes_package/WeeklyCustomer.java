package classes_package;
/*
 *
 * One class to extend the McLarenCustomer. Added 1 field and generated getters and setters.
 *
 */
public class WeeklyCustomer extends McLarenCustomer{
    public int daysPerWeek;

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    @Override
    public void whoAmI() {
        System.out.println("I am " + name + " and i am a weekly customer.");
    }

    public void whoAmI(String preferedAlcohol){
        System.out.println("I am " + name + " and i am a weekly customer. My favourite alcohol is " + preferedAlcohol + "!");
    }
    public void whoAmI(int arrivalHour){
        System.out.println("I am " + name + " and i am a weekly customer. I will reach McLaren's at " + arrivalHour + "!");
    }
}
