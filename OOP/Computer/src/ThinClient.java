public class ThinClient extends Computer {
    private String protocol;

    public ThinClient(String name, String cpu, int primaryMemory, int secondaryMemory, String protocol) {
        super(name, cpu, primaryMemory, secondaryMemory);
        this.protocol = protocol;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public double calculateVirtualMemory() {
        return 0;
    }

    public String toString() {
        return super.toString() + "\nProtocol: " + this.protocol;
    }
}
