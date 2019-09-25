package ClassFor18dz;

public class Reflection {
	public Reflection() {
		
	}

	@Override
	public String toString() {
		return "Reflection [name=" + name + ", count=" + count + ", zamahalo="
				+ zamahalo + "]";
	}

	private String name;
	private int count;
	private boolean zamahalo;

	public Reflection(String name, int count, boolean zamahalo) {
		this.name = name;
		this.count = count;
		this.zamahalo = zamahalo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isZamahalo() {
		return zamahalo;
	}

	public void setZamahalo(boolean zamahalo) {
		this.zamahalo = zamahalo;
	}
}
