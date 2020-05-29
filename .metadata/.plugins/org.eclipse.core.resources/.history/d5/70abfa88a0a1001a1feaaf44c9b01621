package core.dz5;

public class Wheel {
private TypeWeels typeWeels;
private double speed;
private double time;

public Wheel(TypeWeels typeWeels, double speed, double time) {
	this.typeWeels = typeWeels;
	this.speed = speed;
	this.time = time;
}
public double countOFkm(){
	return speed*time;
}
public TypeWeels getTypeWeels() {
	return typeWeels;
}
public void setTypeWeels(TypeWeels typeWeels) {
	this.typeWeels = typeWeels;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public double getTime() {
	return time;
}
public void setTime(double time) {
	this.time = time;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(speed);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(time);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((typeWeels == null) ? 0 : typeWeels.hashCode());
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
	Wheel other = (Wheel) obj;
	if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
		return false;
	if (Double.doubleToLongBits(time) != Double.doubleToLongBits(other.time))
		return false;
	if (typeWeels != other.typeWeels)
		return false;
	return true;
}
@Override
public String toString() {
	return "Wheel [typeWeels=" + typeWeels + ", speed=" + speed + ", time="
			+ time + "]";
}


}
