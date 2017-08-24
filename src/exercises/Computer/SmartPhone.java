package exercises.Computer;

import java.util.ArrayList;

public class SmartPhone extends Computer {

    private String size;
    private String color;
    private final int id;

    public SmartPhone(String amodel, String aoperatingSystem, String[] acomponents, String size, String color) {
        super(amodel, aoperatingSystem, acomponents);
        this.color = color;
        this.size = size;
        this.id = idGenerator();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
