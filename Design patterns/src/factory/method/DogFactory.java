package factory.method;

public class DogFactory extends VehicleFactory {

	@Override
	Moveable create() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
