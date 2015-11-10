package singleton;

public class TestSingletonlazy {
	
	public String name;
	
	private static class TestLaztHolder{
		private static final TestSingletonlazy instance = new TestSingletonlazy();
	}
	
	private TestSingletonlazy(){}
	
	public static final TestSingletonlazy getInstanceTest(){
		return TestLaztHolder.instance;
	}
	
	public void print(){
		System.out.println("the name is" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
