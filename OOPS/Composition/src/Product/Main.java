package Product;

import Parts.Case;
import Parts.Monitor;
import Parts.Motherboard;

public class Main {
    public static void main(String[] args) {
        Motherboard atmegaAcer = new Motherboard("atmegaAcer","atmega","a43xD",4,"Intel", 40,60, 2);
        Monitor irisAcer = new Monitor("irisAcer","Acer","45D",1080,60,80,10);
        Case logitechCase = new Case("logitech-AlphaCase","Logitech","39Af");

       PC myPC = new PC("Acer Predator","Acer","Helios-300",logitechCase,atmegaAcer,irisAcer);
       myPC.TurnOnPc();
       myPC.LoadProgram("Ubuntu");
       myPC.Draw();
       myPC.whatIsMyMonitorDimension();
    }
}
