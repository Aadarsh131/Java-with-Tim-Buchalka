package Parts;

import Product.Product;

public class Monitor extends Product {
    private int resolution;

    public Monitor(String name, String manufacturer, String model, int resolution, float height, float width, float depth) {
        super(name, manufacturer, model);
        this.resolution = resolution;
        super.setHeight(height);
        super.setWidth(width);
        super.setDepth(depth);
    }
    public void Draw(){
        System.out.println("Drawing on " + this.getName() + " Resolution: " + resolution + "p");
    }

    public void Dimensions(){
        System.out.println("Dimensions are "+this.getHeight() +", " +this.getWidth() + " and " +super.getDepth());
        //OR, `super` is more appropriate here until the class is being overridden, we can also use `this` though without any issue (NOTE: when, the child class method is being overridden, then we would need to specificly use `this` to use the overidden class method)
    }
}
