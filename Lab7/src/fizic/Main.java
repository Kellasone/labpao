package fizic;

public class Main {
    public static void main(String[] args) {
        TwoWheelVehicle twoWheelVehicle=new TwoWheelVehicle();
        FourWheelVehicle fourWheelVehicle=new FourWheelVehicle();
//
//        if(fourWheelVehicle instanceof CanPark)
//        {
//            System.out.println("Can park");
//        }
//        else System.out.println("Can not park");

        try {
            System.out.println(fourWheelVehicle.getNumberOfWheels());
        } catch (CustomException e) {
            System.out.println("Aceasta nu merge");
            e.printStackTrace();
        }
    }
}
