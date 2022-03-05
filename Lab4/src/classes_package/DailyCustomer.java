package classes_package;
/*
*
* One class to extend the McLarenCustomer. Added 1 field and generated getters and setters.
*
*/
public class DailyCustomer extends McLarenCustomer {
    public int averageArrivalHour;

    public int getAverageArrivalHour() {
        return averageArrivalHour;
    }

    public void setAverageArrivalHour(int averageArrivalHour) {
        this.averageArrivalHour = averageArrivalHour;
    }

    public DailyCustomer() {
        super();
        System.out.println("DailyCustomer constructor");
        super.setName("Daily Customer");
    }


    public DailyCustomer(String name, float averageTip, String uselessField, int averageArrivalHour) {
//        super(name, averageTip, uselessField);
        this.name = name;
        this.averageTip = averageTip;
        this.setUselessField(uselessField);
        this.averageArrivalHour = averageArrivalHour;
    }
}
