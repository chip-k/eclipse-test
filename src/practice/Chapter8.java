package practice;

public abstract class Chapter8 implements Greeting {
	
	public static void main(String[] args) {
		
		
		Greeting greeting = () -> {
			return "こんにちは";
		};
		
		sayHello(greeting);
		
		System.out.println(greeting.hello());
	
	}
	
	public static void sayHello(Greeting g) {
		System.out.println(g.hello());
	}
		
}
