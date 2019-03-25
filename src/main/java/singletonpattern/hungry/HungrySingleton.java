package singletonpattern.hungry;

/**
 * @Program: singleton-pattern-20190325
 * @Description: 饿汉式单例
 * @Author: whx
 * @Create: 2019-03-25 16:42
 **/
public class HungrySingleton {
	//private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	private static final HungrySingleton hungrySingleton;
	
	static {
		hungrySingleton = new HungrySingleton();
	}
	
	private HungrySingleton() {
	}
	
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
