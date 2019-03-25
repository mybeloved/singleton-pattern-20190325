package singletonpattern.lazy;

/**
 * @Program: singleton-pattern-20190325
 * @Description: 双检查实现懒汉式单例
 * @Author: whx
 * @Create: 2019-03-25 17:04
 **/
public class LazyDoubleCheckSingleton {
	private volatile static LazyDoubleCheckSingleton lazy = null;
	
	private LazyDoubleCheckSingleton() {
	}
	
	public static LazyDoubleCheckSingleton getInstance() {
		if (lazy == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (lazy == null) {
					lazy = new LazyDoubleCheckSingleton();
				}
			}
		}
		return lazy;
	}
}
