public class Laptop extends Computer {
    private int battery;
    public Laptop(String name, int primaryMemory, int secondaryMemory, int battery) {
        super(name, primaryMemory, secondaryMemory);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String toString() {
        return super.toString() + "\nBattery: " + this.battery;
    }
}
