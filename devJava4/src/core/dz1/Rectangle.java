package core.dz1;

public class Rectangle {
	private int height;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int per() {
		return (this.height + this.width) * 2;
	}

	public int plos() {
		return (this.height * this.width);
	}

	public void printPerimetr() {
		System.out.println("Периметр прямокутника = " + per());
	}

	public void printArea() {
		System.out.println("Площа прямокутника = " + plos());
	}
}