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
	
	public double distance(Point p2)
	{
		if ((this.x - p2.x) / (this.y - p2.y) >= 0) {
			return (this.x - p2.x) / (this.y - p2.y);
		}
		else {
			return -((this.x - p2.x) / (this.y - p2.y));
		}
	}
	
	public double OriginDistance() // distance from 0,0
	{
		if ((0 - this.x) / (0 - this.y) >= 0) {
			return (0 - this.x) / (0 - this.y);
		}
		else {
			return -((0 - this.x) / (0 - this.y));
		}
	}

	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")" );
	}
	
	public static void main (String[] args) {
		Point p = new Point('P', IBIO.inputDouble("X-coordinate of P: "), IBIO.inputDouble("Y-coordinate of P: "));
		p.printPoint();
		Point q = new Point('Q', IBIO.inputDouble("X-coordinate of Q: "), IBIO.inputDouble("Y-coordinate of Q: "));
		q.printPoint();
		Point r = new Point('Q', IBIO.inputDouble("X-coordinate of Q: "), IBIO.inputDouble("Y-coordinate of Q: "));
		r.printPoint();
		System.out.println( "P=Q? " + p.equals(q));
		System.out.println( "P=R? " + p.equals(r));
		System.out.println( "Distance between P and Q = " + p.distance(q));
		System.out.println( "Distance of P to origin (0,0) = " + p.OriginDistance());
	}
}