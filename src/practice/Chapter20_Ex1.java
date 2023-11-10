package practice;

public class Chapter20_Ex1 {
	
	class Counter {
		private long count = 0;

		synchronized public void add(long i) {
			System.out.println("足し算します threadName = " + Thread.currentThread().getName());
			count += i;
		}

		synchronized void mul(long i) {
			long c = count;
			System.out.println("かけ算をします threadName = " + Thread.currentThread().getName());
			count *= i;
		}
	}

}
