public class SurveillanceDrone extends Drone {
    SurveillanceDrone(){
        int batteryCapacity_mah = 6000;
        double FlightRange_km = 45.5;
        String SpecialFeatures= "Night-vision and GPS tracking";
    }

    public void setDetails(){
        System.out.println("Surveillance Drone ");
    }

}
