package practice;

public class GenericsMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Basket<Apple> appleBasket = new Basket<>(new Apple("りんご", 200));
		
		Basket<Peach> peachBasket = new Basket<>(new Peach("もも", 300));
		
		appleBasket.printTotalPrice();
		
		peachBasket.printTotalPrice();

	}

}
