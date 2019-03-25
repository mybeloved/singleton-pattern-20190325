package singletonpattern.threadlocal;

/**
 * @Program: singleton-pattern-20190325
 * @Description: ThreadLocal式单例
 * @Author: whx
 * @Create: 2019-03-25 18:02
 **/
public class ThreadLocalSingleton {
	private ThreadLocalSingleton() {
	}
	
	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
			new ThreadLocal<ThreadLocalSingleton>() {
				@Override
				protected ThreadLocalSingleton initialValue() {
					return new ThreadLocalSingleton();
				}
			};
	
	public static ThreadLocalSingleton getInstance() {
		return threadLocalInstance.get();
	}
}
