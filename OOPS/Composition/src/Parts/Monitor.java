package Parts;

import Product.Product;

public class Monitor extends Product {
    private int resolution;

    public Monitor(String name, String manufacturer, String model, int resolution) {
        super(name, manufacturer, model);
        this.resolution = resolution;
    }
    public void Draw(){
        System.out.println("Drawing on " + this.getName() + " Resolution: " + resolution + "p");
    }

    public void Dimensions(){
        System.out.println("Dimensions are "+super.getHeight() +", " +super.getWidth() + " and " +super.getDepth());
    }
}
