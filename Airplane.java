public class Airplane {

    // We want our variables in the main field to be private so that other classes cannot have access to them and manipulate them. Instead, we make our methods public so that we can set or retreive the necessary variables from another class through methods. For example, we have Getter methods which we use to retreive variables from another class. 
    private String airline;
    private String color;
    private int numOfEngines;
    private int capacity;
    private Engine engine1, engine2, engine3, engine4;

    // Static variables and methods. When you declare a variable or a method as static, it belongs to the class, rather than a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don’t create any. It will be shared by all objects.If the variable or method is non-static, we can only access it through an instance of a class which we should first create. We cannot access it through a class. If the variable is static, then I can access it through my class without having to create an intance of that class first because it is class-level. Well I can also access that variable or method through an instance of a class, i.e. an object, but this is not recommended and doing that is discouraged.

    // Default Constructor that has no params. Java gives us this free Construtor whenever we create a class. We write our own custom constructors to override the default one. 
    public Airplane(){
        
    }

    // Custom Constructor that has params. Constructors, in essence, are also methods that are special and are used to initialize objs. The constructor is called when an object of a class is created. 
    public Airplane(String _airline, String _color, int _numOfEngines, int _capacity, Engine _engine1, Engine _engine2, Engine _engine3, Engine _engine4){
        this.airline = _airline; // though "this" is only needed when the variables in the field have the same name as the params
        this.color = _color;
        this.numOfEngines = _numOfEngines;
        this.capacity = _capacity;
        this.engine1 = _engine1;
        this.engine2 = _engine2;
        this.engine3 = _engine3;
        this.engine4 = _engine4;
    }

    // Methods. We want to make our methods public so that we can access them and call them in other classes. Making variables private and methods public is best practice based on one of the 4 famous principles of OOP: Encapsulation.

    // The header part of a method has 5 parts: optional access specifier (public, private, and protected), optional static modifier (We write static for static and leave this part for non-static), return type (void if the method does not return anything, int if it returns an int value, String if it returns a string value, double if it returns a double value, etc.), identifier (any valid name of the method), and finally parameters if the method takes any. 

    // Setter methods. Take a param and assign it to the variable in the field. We use them when we want to change a specific variable
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
    
    // Getter methods. Take no param. Have a return type. Used to access/retrieve each variable in the field since we can't access them direcly as they are private 
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
    
    // Main method. This method will be executed first the Java runs the program. Can also be in a different class.
    public static void main(String[] agrs){
        // Creating objects of Engine class
        Engine engine1 = new Engine(100, 12, "Jet");
        Engine engine2 = new Engine(50, 6, "Jet");
        Engine engine3 = new Engine(90, 11, "Jet");
        Engine engine4 = new Engine(60, 7, "Jet");

        Airplane abc123 = new Airplane("Uzbekistan Airways", "white-yellow", 4, 40, engine1, engine2, engine3, engine4);
        Airplane xyz123 = new Airplane("Centrum Air", "blue", 3, 30, engine1, engine2, engine3, engine4);
        System.out.println(abc123.color);
        // xyz123.color = "green"; // not recommended and not the best practice, though works fine
        // xyz123.setColor("green"); // recommended and good practice
        System.out.println(xyz123.color);
        abc123.setCapacity(35);
        System.out.println(abc123.capacity);
        System.out.println(abc123.getCapacity());

        // if the display() method is non-static, then I can only access it through an object and not through a class. It does make a sense because I need to create a real object first, and then that object can have its display() method which I can then call it from the object. But if I don't create an object, I cannot access it unless I change the method to static because a class in itself is just a blueprint, not a real thing that can have a method. But if I change to static, then it's through a class that I access because that method will be the same for every object and no matter how many instances (objects) of a class I create, this method will be passed on to each of them and will not be changed. If it's static, it belongs to a class and is the same to every object. If it's non-static, then it is unique to every object. We can still access static variables or methods through an object but it is not best practice and doing that is discouraged. 
        // Engine.display(); if the display() method is static

        // engine1.display();
        // engine2.display();
        // engine3.display();
        // engine4.display();

        // System.out.println(abc123.engine1.power); // This does not work because the "power" variable in Engine class is private, so we cannot access it from another class. What we do instead is access the variable through the getter method, which is why this method is important.
        System.out.println(abc123.engine1.getPower());
        xyz123.engine2.setPower(55);
        System.out.println(xyz123.engine2.getPower());
        System.out.println(xyz123.engine3.getEngineType());
        System.out.println(engine3.getEngineType());
        // System.out.println(engine3.engineType); // This does not work because engineType is private which is why we have getEngineType.
        System.out.println(abc123.engine4.getFuelConsumption());
        // System.out.println(Engine.getPower()); Not possible because I need to create an instance of a class first and then I can through that instance can I access getPower() method because the method is non-static.
    }
}
