import practice.Human;

public class InnerClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		leg.kick();

		//	上記を1行で描いた場合
		new Human().new HumanLeg().kick();

	}

}