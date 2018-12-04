package com.zs.hello;

public class Driver {
	//属性--车
	//private Car car;
	//属性--帽子
	private Cap cap;
	private TransService ts;
		public TransService getTs() {
		return ts;
	}
	public void setTs(TransService ts) {
		this.ts = ts;
	}
		//setter和getter注入
		/*public Car getCar() {
			return car;
		}
		public void setCar(Car car) {
			this.car = car;
		}*/
		/**
		 * 构造函数
		 * 构造注入
		 * */
		public  Driver(Cap dcap){
			this.cap=dcap;
		}
		public void driver(){
			ts.addSpeed(20);
			System.out.println("带着"+cap.getColor()+"颜色帽子的司机，车速为"+ts.getSpeed());
		}
}
