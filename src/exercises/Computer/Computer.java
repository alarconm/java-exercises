package exercises.Computer;


import java.util.ArrayList;

public class Computer {

    private String model;
    private String operatingSystem;
    private ArrayList components;

    public Computer(String amodel, String aoperatingSystem, ArrayList acomponents) {

        this.model = amodel;
        this.operatingSystem = aoperatingSystem;
        this.components = acomponents;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ArrayList getComponents() {
        return components;
    }

    public void setComponents(ArrayList components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Model:" + model + " Operating System:" + operatingSystem + " Components:" + components;
    }
}
