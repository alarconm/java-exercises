package exercises.Computer;

public abstract class AbstractEntity {

    private static int nextID = 0;

    public int idGenerator() {
        this.nextID++;
        return this.nextID;
    }
}
