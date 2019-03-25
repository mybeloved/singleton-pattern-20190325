package singletonpattern.register;

/**
 * @Program: singleton-pattern-20190325
 * @Description: 枚举实现注册式单例
 * @Author: whx
 * @Create: 2019-03-25 17:48
 **/

public enum EnumSingleton {
	INSTANCE;
	private Object data;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumSingleton getInstance() {
		return INSTANCE;
	}
}