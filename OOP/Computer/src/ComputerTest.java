
public class ComputerTest {
	
	public static void main (String[] args) {
		Laptop thinkpad = new Laptop("T14s", "i5", 8, 512, 48);
		System.out.println(thinkpad);
		System.out.println("Upgrading");
		thinkpad.setName("Lenovo T14s");
		System.out.println(thinkpad.getName());
		thinkpad.setPrimaryMemory(16);
		System.out.println(thinkpad.getPrimaryMemory()+" GB RAM");
		thinkpad.setSecondaryMemory(1024);
		System.out.println(thinkpad.getSecondaryMemory()+" GB SSD");
		thinkpad.setBatteryCapacity(50);
		System.out.println("Battery Capacity in mWh  : " + thinkpad.getBatteryCapacity());
		System.out.println("Recommended VM allocation: " + thinkpad.calculateVirtualMemory() + " GB");
		System.out.println();

		Desktop myPC = new Desktop("Gaming PC", "R5/1500", 16, 2048, "Radeon 5500XT");
		System.out.println(myPC);
		myPC.setCPU("AMD Ryzen 5 2600");
		System.out.println(myPC.getCPU());
		myPC.setPrimaryMemory(32);
		System.out.println(myPC.getPrimaryMemory()+" GB RAM");
		myPC.setSecondaryMemory(2048);
		System.out.println(myPC.getSecondaryMemory()+" GB SSD");
		myPC.setGPU("Radeon 5700XT");
		System.out.println("Discrete GPU: " + myPC.getGPU());
		System.out.println("Recommended VM allocation = " + myPC.calculateVirtualMemory() + " GB");
		System.out.println();

		System.out.println();
		Server opteron = new Server("Opteron01", "1536", 64,4096, 25);
		opteron.setCPU("2384");
		System.out.println(opteron);
		System.out.println("Upgrading");
		opteron.setCPU("8350");
		System.out.println("Upgraded CPU: " + opteron.getCPU());
		System.out.println( "Recommended VM allocation = " +
				opteron.calculateVirtualMemory() + " GB for " +
				opteron.getClients() + " clients" );
		opteron.setClients(15);
		System.out.println( "Recommended VM allocation = " +
				opteron.calculateVirtualMemory() + " GB for " +
				opteron.getClients() + " clients" );

		System.out.println();
		ThinClient chromeBook = new ThinClient("HP Stream","Core 2 Duo", 4,32, "TCP/IP");
		chromeBook.setCPU("N4020");
		System.out.println(chromeBook);
		System.out.println("Upgrading");
		chromeBook.setProtocol("TCP/IP v4, v6");
		System.out.println(chromeBook.getProtocol());
		System.out.println( "VM allocation = " +
				chromeBook.calculateVirtualMemory() + " GB" );
	}
}

