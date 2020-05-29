package ShablonAbstractFabric;

public class Abstractfabric {
	public static void main(String[] args) {
		Devaicefactory factory = getFactoryByCountryCode("EN");
		Mouse m = factory.getMouse();
		Keyboard k = factory.getKeyboard();
		Touchpad t =  factory.getTouchpad();
		m.click();
		k.println();
		t.track(10,335);
	}

	private static Devaicefactory getFactoryByCountryCode(String lang) {
		switch (lang) {
		case "RU":
			return new Rudevicefactory();
		case "EN":
			return new Endevicefactory();
		default:
			throw new RuntimeException("unsupported Country Code: " + lang);
		}
	}
}

interface Mouse {
	void click();

	void dbclick();

	void scroll(int direction);
}

interface Keyboard {
	void print();

	void println();
}

interface Touchpad {
	void track(int deltaX, int deltaY);
}

interface Devaicefactory {
	Mouse getMouse();

	Keyboard getKeyboard();

	Touchpad getTouchpad();
}

class RuMouse implements Mouse {

	@Override
	public void click() {
		System.out.println("Клик Мишкой");
	}

	@Override
	public void dbclick() {
		System.out.println("Двойной клик");
	}

	@Override
	public void scroll(int direction) {
		if (direction > 0)
			System.out.println("Прокрутка вверх ");
		else if (direction < 0) {
			System.out.println("Прокрутка внис");
		} else
			System.out.println("Не крутим");
	}

}

class RuKeyboatd implements Keyboard {

	@Override
	public void print() {
		System.out.println("Друк страки");

	}

	@Override
	public void println() {
		System.out.println("друк строки + новая стрроока");
	}

}

class RuTouchpad implements Touchpad {

	@Override
	public void track(int deltaX, int deltaY) {
		int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		System.out.println("движениэ" + s + "pixels");

	}

}

class EnMouse implements Mouse {

	@Override
	public void click() {
		System.out.println("Klick-mouse");
	}

	@Override
	public void dbclick() {
		System.out.println("db-Klick mouse");
	}

	@Override
	public void scroll(int direction) {
		if (direction > 0)
			System.out.println("Scrol up");
		else if (direction < 0) {
			System.out.println("Scrol low");
		} else
			System.out.println("No Scrol");
	}

}

class EnKeyboatd implements Keyboard {

	@Override
	public void print() {
		System.out.println("Print Line");

	}

	@Override
	public void println() {
		System.out.println("Print Line + new Line");
	}

}

class EnTouchpad implements Touchpad {

	@Override
	public void track(int deltaX, int deltaY) {
		int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		System.out.println("mowe" + s + "pixels");

	}

}

class Rudevicefactory implements Devaicefactory {

	@Override
	public Mouse getMouse() {

		return new RuMouse();
	}

	@Override
	public Keyboard getKeyboard() {

		return new RuKeyboatd();

	}

	@Override
	public Touchpad getTouchpad() {

		return new RuTouchpad();
	}

}

class Endevicefactory implements Devaicefactory {

	@Override
	public Mouse getMouse() {

		return new EnMouse();
	}

	@Override
	public Keyboard getKeyboard() {

		return new EnKeyboatd();

	}

	@Override
	public Touchpad getTouchpad() {

		return new EnTouchpad();
	}

}