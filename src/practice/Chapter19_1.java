package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// try-with-resourcesを使用
		try (FileWriter fw = new FileWriter("C:\\pleiades\\workspace\\test.txt", true)) {
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}

}
