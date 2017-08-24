package exercises.Computer;

import java.util.ArrayList;

public class Desktop extends Computer {

    private String[] peripherals;
    private String size;
    private final int id;

    public Desktop(String amodel, String aoperatingSystem, String[] acomponents, String[] peripherals, String size) {
        super(amodel, aoperatingSystem, acomponents);
        this.peripherals = peripherals;
        this.size = size;
        this.id = getId();

    }

    public String[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(String[] peripherals) {
        this.peripherals = peripherals;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size =size;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
