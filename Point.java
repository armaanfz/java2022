
public class Point
{
	char name;
	double x;
	double y;
	
	// constructor
	public Point(char pointName, double coordX, double coordY)
	{	
		name = pointName;
		x = coordX;
		y = coordY;
	}
	
	public boolean equals(Point p2)
	{
		return this.x == p2.x && this.y == p2.y;
	}
	
	// public double distance(Point p2)
	{
		
	}
	
	// public double distance() // distance from 0,0
	{
		
	}
	
	
	
	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")" );
	}
	
	public static void main (String[] args)
	{
		Point p = new Point('P', 5, 7);
		p.printPoint();
		Point q = new Point('Q', 5, 7);
		q.printPoint();
		Point r = new Point('R', 7, 8);
		r.printPoint();
		System.out.println( "P=Q? " + p.equals(q) );
		System.out.println( "P=R? " + p.equals(r) );
		System.out.println( "Distance between P and R = " + p.distance(r) );
		System.out.println( "Distance of R to origin (0,0) = " + r.distance() );
		
	}
}

