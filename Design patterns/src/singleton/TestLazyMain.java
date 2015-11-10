package singleton;

public class TestLazyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestSingletonlazy ts1 = TestSingletonlazy.getInstanceTest();
		ts1.setName("Hyman Chen");
		
		TestSingletonlazy ts2 = TestSingletonlazy.getInstanceTest();
		ts2.setName("chenhaoxian");
		
		ts1.print();
		ts2.print();
		
		if(ts1 == ts2){
			System.out.println("create a same instance!");
		}else{
			System.out.println("create a different instance!");
		}

	}

}
