public class Airplane {
    private String airline;
    private String color;
    private int numOfEngines;
    private int capacity;

    // Default Constructor that has no params. Java gives us this free Construtor whenever we create a class. We write our own custom constructors to override the default one. 

    // Custom Constructor that has params
    public Airplane(String _airline, String _color, int _numOfEngines, int _capacity){
        this.airline = _airline; // though "this" is only needed when the variables in the field have the same name as the params
        this.color = _color;
        this.numOfEngines = _numOfEngines;
        this.capacity = _capacity;
    }

    // Setter methods. Takes a param and assigns it to the variable in the field. We use it when we want to change a specific variable
    public void setAirline(String _airline){
        this.airline = _airline;
    }

    public void setColor(String _color){
        this.color = _color;
    }

    public void setNumOfEngines(int _numOfEngines){
        this.numOfEngines = _numOfEngines;
    }

    public void setCapacity(int _capacity){
        this.capacity = _capacity;
    }
    
    // Getter methods. Take no param. Has a return type. Used to access each variable in the field since we can't access them direcly as they are private 
    public String getAirline(){
        return airline;
    }

    public String getColor(){
        return color;
    }

    public int getNumOfEngines(){
        return numOfEngines;
    }

    public int getCapacity(){
        return capacity;
    }

    public static void main(String[] agrs){
        Airplane abc123 = new Airplane("Uzbekistan Airways", "white-yellow", 4, 40);
        Airplane xyz123 = new Airplane("Centrum Air", "blue", 3, 30);
        System.out.println(abc123.color);
        // xyz123.color = "green"; // not recommended and not the best practice, though works fine
        // xyz123.setColor("green"); // recommended and good practice
        System.out.println(xyz123.color);
    }
}
