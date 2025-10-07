public abstract class  Drone {
    protected int BatteryCapacity_mAh;
    protected double FlightRange_km;
    protected  String SpecialFeatures;

    public void setBatteryCapacity_mAh(int BatteryCapacity_mAh) {
        this.BatteryCapacity_mAh = BatteryCapacity_mAh;
    }

    public void  setFlightRange_km(double FlightRange_km){
        this.FlightRange_km = FlightRange_km;
    }

    public void  setSpecialFeatures(String SpecialFeatures) {
       this.SpecialFeatures = SpecialFeatures;
    }

    public void showSpecs(){
        System.out.println("Battery Capacity: " +BatteryCapacity_mAh);
        System.out.println("Flight Range: " + FlightRange_km);
        System.out.println("Special Features: " + SpecialFeatures );
    }
}
