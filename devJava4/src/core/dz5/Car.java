package core.dz5;

public class Car {
	private Helm helm;
	private Wheel wheel;
	private Body body;
	private Drive drive;

	public Car(Helm helm, Wheel wheel, Body body, Drive drive) {
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
		this.drive = drive;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public void setRadius(int radius) {
		helm.setRadius(radius);
	}

	public Wheel getWheel() {
		return wheel;
	}

	public TypeWeels getTypeWeels() {
		return wheel.getTypeWeels();
	}

	public void setTypeWeels(TypeWeels typeWeels) {
		wheel.setTypeWeels(typeWeels);
	}

	public String getColor() {
		return body.getColor();
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Drive getDrive() {
		return drive;
	}

	public int getRadius() {
		return helm.getRadius();
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	@Override
	public String toString() {
		return "Car [helm=" + helm + ", wheel=" + wheel + ", body=" + body
				+ ", drive=" + drive + "]";
	}

	public int addradius(int r) {
		return helm.addradius(r);
	}

	public int getDiametrDrive() {
		return drive.getDiametrDrive();
	}

	public double countOFkm() {
		return wheel.countOFkm();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((drive == null) ? 0 : drive.hashCode());
		result = prime * result + ((helm == null) ? 0 : helm.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (drive == null) {
			if (other.drive != null)
				return false;
		} else if (!drive.equals(other.drive))
			return false;
		if (helm == null) {
			if (other.helm != null)
				return false;
		} else if (!helm.equals(other.helm))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	public void pickUP() {
		body.pickUP();
	}
}
