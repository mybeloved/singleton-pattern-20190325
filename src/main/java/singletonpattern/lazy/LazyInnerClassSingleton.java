package singletonpattern.lazy;

/**
 * @Program: singleton-pattern-20190325
 * @Description: 内部类实现懒汉式单例
 * @Author: whx
 * @Create: 2019-03-25 17:10
 **/
public class LazyInnerClassSingleton {
	private LazyInnerClassSingleton() {
		if (LazyHolder.LAZY != null) {
			throw new RuntimeException("不允许创建多个实例");
		}
	}
	
	public static final LazyInnerClassSingleton getInstance() {
		return LazyHolder.LAZY;
	}
	
	private static class LazyHolder {
		private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
	}
}
