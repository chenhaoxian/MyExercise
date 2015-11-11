package factory.method;

public class TestFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VehicleFactory monkeyFactory = new MonkeyFactory();
		Moveable monkey = monkeyFactory.create();
		monkey.run();

	}

}
