public class Healthyburger extends Hamburger{
    private String healthyItem1;
    private float healthyItem1price;

    private String healthyItem2;
    private float healthyItem2price;


    public Healthyburger( String meat, float price) {
        super("HEALTHY HAMBURGER", "brown rye", meat, price);
    }

//    float finalPrice = super.getPrice();


    public void addHealthyItem1(String name, float price){
        this.healthyItem1 = name;
        this.healthyItem1price = price;
//        finalPrice += this.healthyItem1price;

        System.out.println("Added "+ name + " for an extra of rs " + price);
    }

    public void addHealthyItem2(String name, float price){
        this.healthyItem2 = name;
        this.healthyItem2price = price;
//        finalPrice += this.healthyItem2price;

        System.out.println("Added "+ name + " for an extra of rs " + price);
    }


    @Override
    public float finalPriceHamburger(){
    float finalPrice = super.finalPriceHamburger();

    if(this.healthyItem1price != 0){
        finalPrice += this.healthyItem1price;
    }
    if(this.healthyItem2price !=0){
        finalPrice += this.healthyItem2price;
    }
      System.out.println("Final price of Healthy burger of type brown rye is rsdfgdfgs "+ finalPrice);
      return finalPrice;
    }
}
