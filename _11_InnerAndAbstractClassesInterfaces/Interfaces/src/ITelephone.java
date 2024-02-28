public interface ITelephone {
    void powerOn();
    void dial(int phoneNo);
    void answer();
    boolean callPhone(int phoneNo);
    boolean isRinging();
}
