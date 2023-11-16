package practice;

import java.util.ArrayList;

abstract class Chapter8_2 implements Greeting1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ArrayList<Integer> list = new ArrayList<>();
		for ( int i = 0; i < 5 ; i++) { list.add(i); }
		//ラムダ式の出力命令
		list.forEach ( data -> System.out.print(data));
		//メソッド参照を用いた出力命令
		list.forEach(System.out::print);
		
		// Greeting1 greeting = (String word) -> {
		//	 System.out.println(word);
		// };
		// 上記を「メソッド参照」して書くと下記のように引数を省略できる
		Greeting1 greeting = System.out::println;
		greeting.hello("Hello!");

	}

}
