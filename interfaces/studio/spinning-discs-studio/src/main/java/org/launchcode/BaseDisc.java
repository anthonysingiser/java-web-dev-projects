package org.launchcode;

public abstract class BaseDisc {
    protected String name;
    protected int capacity;
    protected String contents;
    protected String discType;

    protected int spinSpeed;

    public BaseDisc(String name, int capacity, String contents, String discType, int spinSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
    }

    // getters, setters, and other methods...
}
