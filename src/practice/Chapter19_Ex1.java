package practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter19_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		
		// Files.readStringでファイルを読み込む
		 String allData = Files.readString(Path.of("C:\\pleiades\\workspace\\input.txt"), StandardCharsets.UTF_8);
		
		// 読み込んだファイルは、String.split("\n")で行を分割する
		 String[] lines = allData.split("\n");
		 StringBuffer sb = new StringBuffer();
		 
		 for (String line : lines) {
			 String[] items = line.split(",");
			 sb.append(items[0]).append(",").append(items[6]).append("\n");
		 }
		Files.writeString(Path.of("C:\\pleiades\\workspace\\output.txt"), sb.toString());

	}

}
