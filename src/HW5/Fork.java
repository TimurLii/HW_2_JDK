package HW5;

public class Fork {

    private int id;
    private boolean uses;
    // flag использоуется ли в данный момент вилка

    public Fork(int id ) {
    this.id = id;
    }

    public void run() {

    }
    public boolean isUses() {
        return uses;
    }

    public void setUses(boolean uses) {
        this.uses = uses;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "id=" + id +
                '}';
    }
}

