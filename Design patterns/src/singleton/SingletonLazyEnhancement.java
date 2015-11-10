package singleton;

public class SingletonLazyEnhancement {
	
	/**
	 * 懒汉式的增强，实现线性安全
	 */
	
	//静态内部类
	private static class LazyHolder{
		private static final SingletonLazyEnhancement instance = new SingletonLazyEnhancement();
	}
	
	private SingletonLazyEnhancement(){}
	
	public static final SingletonLazyEnhancement getInstance(){
		return LazyHolder.instance;
	}

}
