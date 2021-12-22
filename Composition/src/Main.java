public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(50, 100, 50);
        Case theCase = new Case("gaming242", "ASUS", "240W", dimensions);


        Monitor theMonitor = new Monitor("predator", "Acer", 55, new Resolution(30, 60)); //created an instance of Resolution without initializing any variable for it.

        Motherboard theMotherboard = new Motherboard("bJ-a343", "ASUS", 2, 1, "v2.44");

        PC thePc = new PC(theCase, theMotherboard, theMonitor);
        thePc.PowerOn(450, 550, "Orange");
//        thePc.getMonitor().drawPixelAt(150,450,"RED");
//        thePc.getMotherboard().loadProgram("windows 11");
//        thePc.getTheCase().pressPowerButton();
    }
}
