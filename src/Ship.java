class Ship{

    public int MediumCapacity;
    public String Name;
    public int NumberOfContainers;

    private int Weight;
    private int Height;

    static int ShipPrice;

    protected int MaxSpeed;
    protected int MinSpeed;


    public Ship(int MediumCapacity, String Name, int NumberOfContainers){
        this.MediumCapacity = MediumCapacity;
        this.Name = Name;
        this.NumberOfContainers = NumberOfContainers;
    }

    public Ship(int MediumCapacity, String Name, int NumberOfContainers, int Weight, int Height, int MaxSpeed, int MinSpeed){
        this.MediumCapacity = MediumCapacity;
        this.Name = Name;
        this.NumberOfContainers = NumberOfContainers;
        this.Weight = Weight;
        this.Height = Height;
        this.MaxSpeed = MaxSpeed;
        this.MinSpeed = MinSpeed;
    }

    public void resetValues(int MediumCapacity, String Name, int NumberOfContainers, int Weight, int Height, int MaxSpeed, int MinSpeed){
        this.MediumCapacity = MediumCapacity;
        this.Name = Name;
        this.NumberOfContainers = NumberOfContainers;
        this.Weight = Weight;
        this.Height = Height;
        this.MaxSpeed = MaxSpeed;
        this.MinSpeed = MinSpeed;
    }

    public int getWeight(){
        return this.Weight;
    }
    public void setWeight(int Weight){
        this.Weight = Weight;
    }


    public int getHeight(){
        return this.Height;
    }
    public void setHeight(int Height){
        this.Height = Height;

    }

    public static void printStaticShipPrice(){
        ShipPrice = 555555;
        System.out.println("The static price is " +ShipPrice+ " dollars");
    }

    public void printShipPrice(){
        ShipPrice = 444444;
        System.out.println("The static price is " +ShipPrice+ " dollars (second)");
    }

    @Override
    public String toString(){
        String string = null;
        System.out.println("----------------------------------");
        System.out.println("Weight of the ship is "+this.Weight);
        System.out.println("Height of the ship is "+this.Height);
        System.out.println("Medium capacity of the ship is "+this.MediumCapacity);
        System.out.println("The name of the ship is "+this.Name);
        System.out.println("Number of container "+this.NumberOfContainers);
        System.out.println("Max speed of the ship is "+this.MaxSpeed);
        System.out.println("Min speed of the ship is "+this.MinSpeed);
        return string;
    }
}