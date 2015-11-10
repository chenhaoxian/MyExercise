package singleton;

public class SingletonHungry {
	/**
	 * 饿汉式单例
	 */
	private SingletonHungry(){}
	
	//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的
	private static SingletonHungry singletonHungry = new SingletonHungry();
	
	public static SingletonHungry getInstanceHungry(){
		return singletonHungry;
	}

}
