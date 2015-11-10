package singleton;

public class SingletonLazy {
	/**
	 * 懒汉式单例
	 */
	private SingletonLazy() {}
	
	private static SingletonLazy singletonLazy = null;
	
	public static SingletonLazy getInstanceLazy(){
		if(singletonLazy == null){
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}

}
