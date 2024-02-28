public class Main {
    public static void main(String[] args) {
        //since atulPhone is specified as of type ITelephone here, hence we can change it to all the class instance which implements the interface ITelephone
        ITelephone atulPhone = new DeskPhone(12345);
        atulPhone.powerOn();
        atulPhone.callPhone(12345);
        atulPhone.answer();

        //changing the instance to type MobilePhone (possible because MobilePhone also implements ITelephone interface)
        atulPhone = new MobilePhone(938088);
        atulPhone.powerOn();
        atulPhone.dial(938088);
    }
}