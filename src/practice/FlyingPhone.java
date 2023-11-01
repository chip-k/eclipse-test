package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	
	private int time;
	
	public FlyingPhone(int time) {
		this.time = time;
	}
	
	@Override
	public void fly() {
		System.out.println(time + "分間、飛びます。");
	}
	
	@Override
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}

}
