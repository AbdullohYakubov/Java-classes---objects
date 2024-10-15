public class Engine {
    private int power; // KN
    private int fuelConsumption;
    private String engineType;

    // Constructor
    public Engine(int _power, int _fuelConsuption, String _engineType){
        this.power = _power;
        this.fuelConsumption = _fuelConsuption;
        this.engineType = _engineType;
    }

    // Setter methods
    public void setPower(int _power){
        this.power = _power;
    }

    public void setFuelConsumption(int _fuelConsuption){
        this.fuelConsumption = _fuelConsuption;
    }
    
    public void setEngineType(String _engineType){
        this.engineType = _engineType;
    }

    // Getter methods
    public int getPower(){
        return this.power;
    }

    public int getFuelConsumption(){
        return this.fuelConsumption;
    }

    public String getEngineType(){
        return this.engineType;
    }
    
    // A method that displays the properties of the objects
    public void display(){
        System.out.println("Power = " + power + "\nFuel Consumption = " + fuelConsumption + "\nEngine Type = " + engineType);
    }
    
    // Because this method is static, it cannot access variables in a non-static way, meaning it cannot access power, fuelConsumption, and engineType unless we change them to static
    // public static void display(){
    //     System.out.println("Power = " + power + "\n Fuel Consumption = " + fuelConsumption + "\n Engine Type = " + engineType);
    // }
}

