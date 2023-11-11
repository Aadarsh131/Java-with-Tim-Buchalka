package Parts;

import Product.Product;

public class Motherboard extends Product {

    private int ramSlots;
    private String bios;

    public Motherboard(String name, String manufacturer, String model, int ramSlots, String bios, float height, float width, float depth) {
        this(name,manufacturer,model,ramSlots, bios);//delegation
        super.setHeight(height);
        super.setWidth(width);
        super.setDepth(depth);
//        System.out.println("Motherboard ovelaoded ctr (with all incl. dimensions)");
    }

    private Motherboard(String name, String manufacturer, String model, int ramSlots, String bios) {
      this(name,manufacturer,model);//delegation
        this.ramSlots = ramSlots;
        this.bios = bios;
//        System.out.println("Motherboard ovelaoded ctr (with ramSlots and bios)");
    }

    private Motherboard(String name, String manufacturer, String model) {
        super(name, manufacturer, model);
//        System.out.println("Motherboard default ctr");
    }

    public void LoadProgram(String OsName){
        System.out.println(OsName + " loaded on " + this.getName() + "(" + this.getModel() + ")" + " from " + this.getManufacturer());
    }

}
