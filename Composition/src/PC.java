public class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void PowerOn(int x, int y, String color){
        theCase.pressPowerButton();
        motherboard.loadProgram("windows 11");
        showPixels(x, y, color);
    }

    private void showPixels(int x, int y, String color){
        monitor.drawPixelAt(x, y, color);
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }

}
