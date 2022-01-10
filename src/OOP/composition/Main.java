package OOP.composition;

public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(254, 1440));
//
//        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
//
//        thePC.powerUp();
//

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2,1);

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedroom = new Bedroom("Kinga's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
