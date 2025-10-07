class ManufacturerB extends DroneFactory {
    public Drone createSurveillanceDrone(){
        SurveillanceDrone drone = new SurveillanceDrone();
        drone.setBatteryCapacity_mAh(88000);
        drone.setFlightRange_km(45.5);
        drone.setSpecialFeatures("Night-vision and GPS tracking");
        return drone;
    }
    public Drone createDeliveryDrone(){
        DeliveryDrone drone = new DeliveryDrone();
        drone.setBatteryCapacity_mAh(4000);
        drone.setFlightRange_km(60.5);
        drone.setSpecialFeatures("Secure lock system");
        return drone;
    }
    public Drone createAgricultureDrone(){
        AgricultureDrone drone = new AgricultureDrone();
        drone.setBatteryCapacity_mAh(8000);
        drone.setFlightRange_km(40.1);
        drone.setSpecialFeatures("Secure lock system");
        return drone;

    }


}



