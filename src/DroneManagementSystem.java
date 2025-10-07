public class DroneManagementSystem{
    public static void main(String[]args){
        DroneFactory FactoryA = new ManufacturerA();
        DroneFactory FactoryB = new ManufacturerB();

        Drone SurvA = FactoryA.createSurveillanceDrone();


        Drone SurvB = FactoryB.createSurveillanceDrone();

        System.out.println("Manufacturer A Drone ");
        SurvA.showSpecs();
        System.out.println("\n");
        System.out.println("Manufacturer B Drone ");
        SurvB.showSpecs();




    }
}