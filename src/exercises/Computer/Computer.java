package exercises.Computer;


public class Computer extends AbstractEntity {

    public static void main(String[] args) {
        String[] components = {"CPU", "Videocard"};
        Laptop macBook = new Laptop("Air", "OS10", components, "15inches", "Fullkey");
        System.out.println(macBook);
        System.out.println(macBook.getKeyBoard() + macBook.getSize() + macBook.getModel());
        System.out.println(macBook.getId());
        Laptop macBook2 = new Laptop("dilly", "Dillybar", components, "dilly", "dill");
        System.out.println(macBook2.getId());
    }

    private String model;
    private String operatingSystem;
    private String[] components;
    private final int id;

    public Computer(String amodel, String aoperatingSystem, String[] acomponents) {

        this.model = amodel;
        this.operatingSystem = aoperatingSystem;
        this.components = acomponents;
        this.id = idGenerator();
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
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

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Model:" + model + " Operating System:" + operatingSystem + " Components:" + components;
    }
}
