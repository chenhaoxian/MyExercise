package factory.abstractfactory;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Factory1 factort1 = new CreateFactory1();
		InterProductA productA1 = factort1.getProductA1();
		InterProductB productB1 = factort1.getProductB1();
		productA1.method();
		productB1.method();
		
		
		Factory2 factory2 = new CreateFactory2();
		InterProductA productA2 = factory2.getProductA2();
		InterProductB productB2 = factory2.getProductB2();
		productA2.method();
		productB2.method();
	}

}
