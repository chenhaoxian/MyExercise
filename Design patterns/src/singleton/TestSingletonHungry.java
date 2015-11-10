package singleton;

public class TestSingletonHungry {
	
	
	private String name ;
	
	private TestSingletonHungry(){}
	
	private static TestSingletonHungry instance = new TestSingletonHungry();
	
	public static TestSingletonHungry getInstance(){
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println("name is "+ name );
	}
	
		
		
}
