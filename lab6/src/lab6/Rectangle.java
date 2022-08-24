package lab6;

public class Rectangle {
	private double width = 1;
	private double height = 1;

	Rectangle() {

	}

	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	public double GetArea() {
		return width * height;
	}

	public double Perimeter() {
		return (2 * width) + (2 * height);
	}
}
