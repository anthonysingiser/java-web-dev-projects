package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int capacity, String contents, String discType, int spinSpeed) {
        super(name, capacity, contents, discType, spinSpeed);
    }

    // Override methods from OpticalDisc...
    @Override
    public void spinDisc() {
        System.out.println(this.spinSpeed + " RPM");
    }
    @Override
    public void storeData() {
        System.out.println("Storing data to " + this.discType);
    }
    @Override
    public void writeDataWithLaser() {
        System.out.println("Writing data to " + this.discType + " with laser");
    }
    @Override
    public void readDataWithLaser() {
        System.out.println("Reading data from " + this.discType + " with laser");
    }
    @Override
    public void load() {
        System.out.println("Loading " + this.discType);
    }

}
