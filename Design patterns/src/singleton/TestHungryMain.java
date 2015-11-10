package singleton;

public class TestHungryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestSingletonHungry ts1 = TestSingletonHungry.getInstance();
		ts1.setName("chenhaoxian");
		
		TestSingletonHungry ts2 = TestSingletonHungry.getInstance();
		ts2.setName("Hyman Chen");
		
		ts1.print();
		ts2.print();
		
		if(ts1 == ts2){
			System.out.println("create a same instance!");
		}else{
			System.out.println("create a different instance!");
		}
		

	}

}
