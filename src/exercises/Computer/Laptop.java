package exercises.Computer;


public class Laptop extends Computer {

    private String size;
    private String keyBoard;
    private final int id;

    public Laptop(String amodel, String aoperatingSystem, String[] acomponents, String size, String keyBoard) {
        super(amodel, aoperatingSystem, acomponents);
        this.size = size;
        this.keyBoard = keyBoard;
        this.id = getId();
    }

    public String getSize() {
        return size;
    }

    private void setSize(String size) {
        this.size = size;
    }

    public String getKeyBoard() {
        return keyBoard;
    }
    private void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
