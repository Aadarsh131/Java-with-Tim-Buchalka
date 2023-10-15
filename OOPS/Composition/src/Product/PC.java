package Product;

import Parts.Case;
import Parts.Monitor;
import Parts.Motherboard;

public class PC extends Product{
    private Case CASE;
    private Motherboard MOTHERBOARD;
    private Monitor MONITOR;

    public PC(String name, String manufacturer, String model, Case CASE, Motherboard MOTHERBOARD, Monitor MONITOR) {
        super(name, manufacturer, model);
        this.CASE = CASE;
        this.MOTHERBOARD = MOTHERBOARD;
        this.MONITOR = MONITOR;
    }

   public void Draw (){
        MONITOR.Draw();
   }
   public void LoadProgram(String OsName){
       MOTHERBOARD.LoadProgram(OsName);
   }
   public void TurnOnPc(){
        CASE.TurnOnPc();
   }


//NOT ideal to give direct access to the these critical classes, instead we will provide what is important for a user
//    public Case getCASE() {
//        return CASE;
//    }
//
//    public Motherboard getMOTHERBOARD() {
//        return MOTHERBOARD;
//    }
//
//    public Monitor getMONITOR() {
//        return MONITOR;
//    }
}
