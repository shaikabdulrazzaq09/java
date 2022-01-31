public class ScaleableCircle extends Circle implements Scaleable
{
	public ScaleableCircle(int x, int y, int radius)
	{
		super(x, y, radius);
	}

	public void scale(int factor)
	{
		radius *= factor;
	}

	public static void main(String[] args)
	{
		ScaleableCircle c = new ScaleableCircle(5, 5, 10);
		System.out.println("Circle c is " + c);

		c.scale(2);
		System.out.println("Circle c now is " + c);
	}
}
