public class Main {
    public static void main(String[] args) {
        Hamburger hb = new Hamburger("BASIC HAMBURGER", "ThickBread", "chicken", 200);
        hb.addAdditional1item("tomato", 40);
        hb.addAdditional2item("lettuce", 50);
        hb.finalPriceHamburger();

        System.out.println("--".repeat(50));

        Healthyburger healthyburger = new Healthyburger("white", 150);
        healthyburger.addAdditional1item("oregano", 20);
        healthyburger.addHealthyItem1("onion", 25);
        healthyburger.addHealthyItem2("cheese", 60);
        healthyburger.finalPriceHamburger();

        System.out.println("--".repeat(50));

        DeluxeBurger db = new DeluxeBurger();
        db.addAdditional1item("adlf", 54);
        db.addAdditional4item("oot", 654);
        db.finalPriceHamburger();
    }
}
