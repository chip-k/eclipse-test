package practice;

	class Basket<E extends Fruit> {
		private E elem;
		private final int PRICE = 100;
		
		public Basket(E e) {
			elem = e;
		}
		
		public void replace(E e) {
			elem = e;
		}
		
		public E get() {
			return elem;
		}
		
		public void printName() {
		    // EはFruitのサブクラスなので、getNameが使えると保証されている
		    System.out.println("籠の中身は" + elem.getName() + "です");
		}
		
		public void printTotalPrice() {
			int totalPrice = elem.getPrice() + PRICE;
			System.out.println("合計金額は" + totalPrice + "円です。");
		}
	}
	
	
	class Apple extends Fruit {
		public Apple(String name, int price) {
			super(name, price);
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public int getPrice() {
			return price;
		}
	}
	
	
	class Peach extends Fruit {
		public Peach(String name, int price) {
			super(name, price);
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public int getPrice() {
			return price;
		}
	}
