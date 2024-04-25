package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCd = new CD("CD Name", 700, "CD Contents", "CD", 200);
        DVD myDvd = new DVD("DVD Name", 4700, "DVD Contents", "DVD", 1600);

        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.storeData();
        myDvd.storeData();
        myCd.writeDataWithLaser();
        myDvd.writeDataWithLaser();
        myCd.readDataWithLaser();
        myDvd.readDataWithLaser();
        myCd.load();
        myDvd.load();
    }
}