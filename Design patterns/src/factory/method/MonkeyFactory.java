package factory.method;

public class MonkeyFactory extends VehicleFactory {

	@Override
	Moveable create() {
		return new Monkey();
	}

}
