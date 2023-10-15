public class Hamburger {
    private final String name;
    private final String breadRollType;
    private final String meat;
    private float price;

    private String additional1name;
    private float additional1price;

    private String additional2name;
    private float additional2price;

    private String additional3name;
    private float additional3price;

    private String additional4name;
    private float additional4price;

    public Hamburger(String name, String breadRollType, String meat, float price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditional1item(String name, float price){
        this.additional1name = name;
        this.additional1price = price;
        this.price += price;

        System.out.println("Added "+ name + "  for an extra of " + price);
//        System.out.println("price of hamburger with " + name + "addition is: "+ this.additional1price);
    }

    public void addAdditional2item(String name, float price){
        this.additional2name = name;
        this.additional2price = price;
        this.price += this.additional2price;

        System.out.println("Added "+ name + " for an extra of rs " + price);
//        System.out.println("price of hamburger with " + name + "addition is: "+ this.additional2price);
    }

    public void addAdditional3item(String name, float price){
        this.additional3name = name;
        this.additional3price = price;
        this.price += this.additional3price;

        System.out.println("Added "+ name + " for an extra of rs " + price);
//        System.out.println("price of hamburger with " + name + "addition is: "+ this.additional3price);
    }

    public void addAdditional4item(String name, float price){
        this.additional4name = name;
        this.additional4price = price;
        this.price += this.additional4price;

        System.out.println("Added "+ name + " for an extra of rs " + price);
//        System.out.println("price of hamburger with " + name + "addition is: "+ this.additional4price);
    }

    public float finalPriceHamburger(){
        System.out.println("Final price of " +this.name+ " of type "+this.breadRollType+ " is rs "+ this.price);
        return this.price;
    }

    public float getPrice() {
        System.out.println(price);
        return price;
    }
}
