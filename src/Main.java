public class Main{

    public static void main(String[] args) {

        Ship Titanic = new Ship(100, "TITANIC", 233);
        Titanic.setWeight(20000);
        Titanic.setHeight(200);
        Titanic.toString();
        Titanic.printStaticShipPrice();


        Ship BlackPearl = new Ship(200," BLACKPEARL", 333, 2000, 100, 150, 1);
        BlackPearl.toString();
        BlackPearl.printShipPrice();
    }
}
