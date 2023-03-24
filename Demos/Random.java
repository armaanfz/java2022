
public class Random {
	
	public static int randInt(int n)
	{
		int r = (int)((Math.random() * n) + 1);
		return r;
	}
	public static void main (String[] args) {
		System.out.println( randInt(20) );
		System.out.println( randInt(10) );
		System.out.println( randInt(8) );
		System.out.println( randInt(6) );
		System.out.println( randInt(4) );
	}
}

