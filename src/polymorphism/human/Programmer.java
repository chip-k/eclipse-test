package polymorphism.human;

public class Programmer extends Human {
	
	public void study() {
		System.out.println("技術書を読みます");
	}
	
	@Override
	public void work() {
		System.out.println("プログラムを書きます");
	}

}
