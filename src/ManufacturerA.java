class ManufacturerA extends DroneFactory {

    public Drone createSurveillanceDrone(){
       SurveillanceDrone drone = new SurveillanceDrone();
       drone.setBatteryCapacity_mAh(6000);
       drone.setFlightRange_km(65.5);
       drone.setSpecialFeatures("Night-vision and GPS tracking");
       return drone;
    }
    public Drone createDeliveryDrone(){
        DeliveryDrone drone = new DeliveryDrone();
        drone.setBatteryCapacity_mAh(2000);
        drone.setFlightRange_km(80.5);
        drone.setSpecialFeatures("Secure lock system");
        return drone;
    }
    public Drone createAgricultureDrone(){
        AgricultureDrone drone = new AgricultureDrone();
        drone.setBatteryCapacity_mAh(4000);
        drone.setFlightRange_km(60.1);
        drone.setSpecialFeatures("Secure lock system");
        return  drone;
    }

}



