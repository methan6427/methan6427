package lab6;

public class Fan {
	private int Speed=0;
	private boolean On=false;
	private double Radius=0;
	private String Color="blue";

	Fan() {

	}

	public int getSpeed() {
		return Speed;
	}

	public void SetSpeed(int newSpeed) {

		if (newSpeed >= 0) {
			Speed = newSpeed;
		} else {
			System.out.println("the speed shouldn't be negative like you");
		}
	}

	public double getRadius() {
		return Radius;
	}

	public void SetRadius(int newRadius) {

		if (newRadius >= 0) {
			Radius = newRadius;
		} else {
			System.out.println("the speed shouldn't be negative like you");
		}
	}

	public boolean getOn() {
		return On;
	}

	public void SetOn(boolean newOn) {

		On = newOn;
	}

	public String getColor() {
		return Color;
	}

	public void SetColor(String newColor) {
		Color = newColor;
	}

	public String toString() {
		if (On == true)
			return "speed is\n" + Speed + ",on is\n " + On + ",radius is\n" + Radius + ",color is\n" + Color;
		return "color is\n" + Color + ",radius is\n" + Radius + "the fan is OFF!\n";
	}

}
