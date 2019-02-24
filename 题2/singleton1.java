package 面试题2;

//懒汉式方法，不适合多线程
public class singleton1 {
	private singleton1() {
	}

	private static singleton1 singleTonInstance = null;
	public static singleton1 getInstance() {
		if (singleTonInstance == null) {
			singleTonInstance = new singleton1();
		}
		return singleTonInstance;
	}
}
