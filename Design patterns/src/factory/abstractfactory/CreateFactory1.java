package factory.abstractfactory;

public class CreateFactory1 extends Factory1 {

	@Override
	InterProductA getProductA1() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	InterProductB getProductB1() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
