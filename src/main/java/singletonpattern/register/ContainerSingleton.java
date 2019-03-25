package singletonpattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Program: singleton-pattern-20190325
 * @Description: 容器实现注册式单例
 * @Author: whx
 * @Create: 2019-03-25 17:59
 **/
public class ContainerSingleton {
	private ContainerSingleton() {
	}
	
	private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();
	
	public static Object getInstance(String className) {
		synchronized (ioc) {
			if (!ioc.containsKey(className)) {
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					ioc.put(className, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return obj;
			} else {
				return ioc.get(className);
			}
		}
	}
}
