public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging = false;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        if(isOn){
            System.out.println("Already powered On");
        }
        else{
            isOn = true;
            System.out.println("Powering on the mobilePhone");
        }
    }

    @Override
    public void dial(int phoneNo) {
        if(isOn){
            System.out.println("Dialling number: "+phoneNo);
        }
        else{
            System.out.println("Cannot dial, moblie is switched off");
        }
    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNo) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
