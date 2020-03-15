import java.awt.Robot;
import java.util.concurrent.TimeUnit;

class MouseMove{

	public static void main(String[] args)
	{
		Robot robot = null;
		int x = 0;
		int y = 0;

		try
		{
			robot = new Robot();
		}
		catch (Exception ex){}

		while(true)
		{
			x = generateRandomNumber(1, 500);
			y = generateRandomNumber(1, 500);

			try
			{
				robot.mouseMove(x, y);
				TimeUnit.MINUTES.sleep(2);
			}
			catch (Exception e){}
		}
	}

	private static int generateRandomNumber(int min, int max)
	{
		return (int)(Math.random() * (max-1) + min);
	}
}
