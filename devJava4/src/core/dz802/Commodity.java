package core.dz802;

public class Commodity {
	private String name;
	private double prise;
	private double weight;
	private int height;
	private int width;

	public Commodity(String name, double prise, double weight, int height,
			int width) {

		this.name = name;
		this.prise = prise;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrise() {
		return prise;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", prise=" + prise + ", weight="
				+ weight + ", height=" + height + ", width=" + width + "]";
	}

}
