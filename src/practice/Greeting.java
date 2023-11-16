package practice;

@FunctionalInterface
public interface Greeting {
	
	public String hello();
	
	public static void sayHello(Greeting g) {
		System.out.println(g.hello());
	}

}
