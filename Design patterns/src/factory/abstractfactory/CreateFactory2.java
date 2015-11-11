package factory.abstractfactory;

public class CreateFactory2 extends Factory2 {

	@Override
	InterProductA getProductA2() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	InterProductB getProductB2() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
