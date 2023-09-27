public class Desktop extends Computer {
    private String GPU;
    public Desktop(String name, int primaryMemory, int secondaryMemory, String GPU) {
        super(name, primaryMemory, secondaryMemory);
        this.GPU = GPU;
    }

    public String getBattery() {
        return GPU;
    }

    public void setBattery(int battery) {
        this.GPU = GPU;
    }

    public double getVirtualMemory() {
        return this.getPrimaryMemory() * 2;
    }

    public String toString() {
        return super.toString() + "\nBattery: " + this.GPU;
    }
}
