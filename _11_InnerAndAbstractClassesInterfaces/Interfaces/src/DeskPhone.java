public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging = false;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone has no power button");
    }

    @Override
    public void dial(int phoneNo) {
        System.out.println("Dialling number: "+phoneNo);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the DeskPhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNo) {
        if(phoneNo == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
