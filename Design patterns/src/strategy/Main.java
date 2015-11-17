package strategy;

public class Main {

	/**
	 * @param args
	 * 
	 * 策略者模式
	 * 高内聚低耦合！！
	 */
	public static void main(String[] args) {
		Controller controller1 = new Controller(new Eat());
		controller1.operate();
		
		

	}

}
