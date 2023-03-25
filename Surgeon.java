// Surgeon.java
public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + (operating ? " is operating now." : " is not operating now."));
    }

    @Override
    public String toString() {
        return super.toString() + " Operating: " + operating;
    }
}
