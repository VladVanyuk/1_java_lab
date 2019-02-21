class Ship {

    public int mediumCapacity;
    public String name;
    public int numberOfContainers;

    private int weight;
    private int height;

    protected static int shipPrice;

    protected int maxSpeed;
    protected int minSpeed;


    public Ship(int mediumCapacity, String name, int numberOfContainers) {
        this.mediumCapacity = mediumCapacity;
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public Ship(int mediumCapacity, String name, int numberOfContainers, int weight, int height, int maxSpeed, int minSpeed, int shipPrice) {
        this(mediumCapacity, name, numberOfContainers);
        this.weight = weight;
        this.height = height;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.shipPrice = shipPrice;
    }

    public void resetValues(int mediumCapacity, String name, int numberOfContainers, int weight, int height, int maxSpeed, int minSpeed, int shipPrice) {
        this.mediumCapacity = mediumCapacity;
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        this.weight = weight;
        this.height = height;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.shipPrice = shipPrice;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void printStaticShipPrice() {
        System.out.println("Price: " + shipPrice);
    }

    public void printShipPrice() {
        System.out.println("Price: " + shipPrice);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "MediumCapacity=" + mediumCapacity +
                ", Name='" + name + '\'' +
                ", NumberOfContainers=" + numberOfContainers +
                ", Weight=" + weight +
                ", Height=" + height +
                ", MaxSpeed=" + maxSpeed +
                ", MinSpeed=" + minSpeed +
                '}';
    }
}