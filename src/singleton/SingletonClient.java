package singleton;
class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton() : Initializing Instance");
	}

	public static Singleton getInstance() {

		if (instance == null)
			instance = new Singleton();

		return instance;
	}

	public void doSomething() {
		System.out.println("Singleton : doSomething() ");
	}
}

public class SingletonClient {
	public static void main(String[] args) {
		System.out.println(" Hello World");
		Singleton.getInstance().doSomething();
	}
}