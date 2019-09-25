package core.dz5;

public class Drive {
private int countOfButter;
private int diametrDrive;
public Drive(int countOfButter, int diametrDrive) {
	this.countOfButter = countOfButter;
	this.diametrDrive = diametrDrive;
}
public int getCountOfButter() {
	return countOfButter;
}
public void setCountOfButter(int countOfButter) {
	this.countOfButter = countOfButter;
}
public int getDiametrDrive() {
	return diametrDrive;
}
public void setDiametrDrive(int diametrDrive) {
	this.diametrDrive = diametrDrive;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + countOfButter;
	result = prime * result + diametrDrive;
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
	Drive other = (Drive) obj;
	if (countOfButter != other.countOfButter)
		return false;
	if (diametrDrive != other.diametrDrive)
		return false;
	return true;
}
@Override
public String toString() {
	return "Drive [countOfButter=" + countOfButter + ", diametrDrive="
			+ diametrDrive + "]";
}



}
