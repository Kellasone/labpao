package classes_package;
/*
*
* Base class. We will use this to extend further. We will use 2 public fields and 1 private field, to prove some concepts.
* Generated getters, setters and 2 constructors, one with all parameters and one with no parameter
*
*/
public class McLarenCustomer {
    public String name;
    public float averageTip;
    private String uselessField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageTip() {
        return averageTip;
    }

    public void setAverageTip(float averageTip) {
        this.averageTip = averageTip;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void setUselessField(String uselessField) {
        this.uselessField = uselessField;
    }

    public McLarenCustomer() {
        System.out.println("McLarenCustomer Constructor without parameters");
    }

    public McLarenCustomer(String name, float averageTip, String uselessField) {
        System.out.println("McLarenCustomer Constructor with all parameters");

        this.name = name;
        this.averageTip = averageTip;
        this.uselessField = uselessField;
    }

    public void whoAmI(){
        System.out.println("I am " + name);
    }
}
