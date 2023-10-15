public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DELUXE BURGER", "Sausage & Bacon","White", 500);
        super.addAdditional1item("Chips", 20);
        super.addAdditional2item("Drink", 50);
    }

    @Override
    public void addAdditional1item(String name, float price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAdditional2item(String name, float price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAdditional3item(String name, float price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAdditional4item(String name, float price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}

