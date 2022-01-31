public class Circle 
{
	int x, y, radius;

	public Circle()
	{
		x = y = radius = 0;
	}

	public Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString()
	{
		return "Center at (" + x + ", " + y + ") and radius is " + radius;
	}
}
