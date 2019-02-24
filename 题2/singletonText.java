package √Ê ‘Ã‚2;

public class singletonText {

	public static void main(String[] args) {
		singleton1 singleTonInstance_1 = singleton1.getInstance();
		singleton1 singleTonInstance_2 = singleton1.getInstance();
		System.out.println("singleTonInstance_1.hashCode() = " + singleTonInstance_1.hashCode());
		System.out.println("singleTonInstance_2.hashCode() = " + singleTonInstance_2.hashCode());

	}

}
