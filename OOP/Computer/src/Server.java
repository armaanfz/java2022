public class Server extends Computer {

	private int clients;

	public Server(String name, String cpu, int primaryMemory, int secondaryMemory, int clients) {
		super(name, cpu, primaryMemory, secondaryMemory);
		this.clients = clients;
	}

	public int getClients() {
		return clients;
	}

	public void setClients(int clients) {
		this.clients = clients;
	}

	// just for example purposes
	public double calculateVirtualMemory() {
		return (this.getPrimaryMemory() * 3) + (this.clients * 0.5);
	}

	public String toString() {
		return super.toString() + "\nClients: " + this.clients;
	}
}
