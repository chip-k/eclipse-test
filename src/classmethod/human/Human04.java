package classmethod.human;

public class Human04 {
//	メンバー変数、static変数
	static public int humanCount = 0;
//	インスタンス変数
	public String name;
//	定数
	public static final String GREETING = "こんにちは";
	
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
	}
	
	static public void staticMethodPrint() {
//		staticメソッドからインスタンス変数は使用できない(コンパイルエラー)
//		System.out.println("名前は" + name);
		System.out.println("人の数は"+ Human04.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}
}
