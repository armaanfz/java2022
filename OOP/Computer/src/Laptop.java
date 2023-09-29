public class Laptop extends Computer {
    private int battery;
    public Laptop(String name, String cpu, int primaryMemory, int secondaryMemory, int battery) {
        super(name, cpu, primaryMemory, secondaryMemory);
        this.battery = battery;
    }

    public int getBatteryCapacity() {
        return battery;
    }

    public void setBatteryCapacity(int battery) {
        this.battery = battery;
    }
    public double calculateVirtualMemory() {
        return this.getPrimaryMemory() * 1.2;
    }

    public String toString() {
        return super.toString() + "\nBattery: " + this.battery;
    }
}
