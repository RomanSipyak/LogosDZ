package core.dz5;

public class Helm {
	private int radius;

	public Helm(int radius) {
		this.radius = radius;
	}

	public int addradius(int r) {
		return radius += r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helm other = (Helm) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Helm [radius=" + radius + "]";
	}

}
