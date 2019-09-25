package ShablonFabric;

import java.util.Date;

public class FactoryMatodAPP {

	public static void main(String[] args) {
		// Watch watch = new DigitalWatch();
		// watch.showTime();
		WatchMaker maker1 = new DigitalwatchMacker();
		WatchMaker maker2 = new RomeWatchMacker();
		Watch watch = maker1.creatWatch();
		Watch watch2 = maker2.creatWatch();
		watch.showTime();
		watch2.showTime();
		WatchMaker maker3 = getMakerByName("RomeWatchMacker");
		Watch watch3 = maker3.creatWatch();
		watch3.showTime();

	}

	public static WatchMaker getMakerByName(String maker) {
		if (maker.equals("DigitalwatchMacker"))
			return new DigitalwatchMacker();

		else if (maker.equals("RomeWatchMacker"))
			return new RomeWatchMacker();

		throw new RuntimeException("Нема такого виробника" + maker);
	}
}

interface Watch {
	void showTime();
}

class DigitalWatch implements Watch {

	@Override
	public void showTime() {
		System.out.println(new Date());
		WatchMaker RomeWatch = new RomeWatchMacker();

	}

}

class RomeWatch implements Watch {

	@Override
	public void showTime() {
		System.out.println("VII");

	}

}

interface WatchMaker {
	Watch creatWatch();
}

class DigitalwatchMacker implements WatchMaker {

	@Override
	public Watch creatWatch() {
		return new DigitalWatch();
	}

}

class RomeWatchMacker implements WatchMaker {

	@Override
	public Watch creatWatch() {
		return new RomeWatch();
	}

}