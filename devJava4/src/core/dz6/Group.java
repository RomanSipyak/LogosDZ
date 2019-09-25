package core.dz6;

import static core.dz6.Fakultet.*;

public enum Group {
	KI1(30, KI), KI2(31, KI), KI3(32, KI), PI1(30, PI), PI2(31, PI), PI3(32, PI), KN1(
			30, KN), KN2(31, KN), KN3(33, KN), SP1(30, SP), SP2(31, SP), SP3(
			32, SP);
	private int count;
	private final Fakultet fakultet;

	public int getCount() {
		return count;
	}

	public Fakultet getFakultet() {
		return fakultet;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private Group(int count, Fakultet fakultet) {
		this.count = count;
		this.fakultet = fakultet;
	}
}
