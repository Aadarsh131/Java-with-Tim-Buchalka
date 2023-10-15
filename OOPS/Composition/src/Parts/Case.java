package Parts;
import Product.*;

public class Case extends Product{


    public Case(String name, String manufacturer, String model) {
        super(name, manufacturer, model);
    }
    public void TurnOnPc(){
        System.out.println("Powering ON");
    }
}
