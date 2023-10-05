public class Desktop extends Computer {
    private String GPU;
    public Desktop(String name, String cpu, int primaryMemory, int secondaryMemory, String GPU) {
        super(name, cpu, primaryMemory, secondaryMemory);
        this.GPU = GPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public double calculateVirtualMemory() {
        return this.getPrimaryMemory() * 2;
    }

    public String toString() {
        return super.toString() +
    }
}
