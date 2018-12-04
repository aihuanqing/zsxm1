package com.zs.hello;
/**
 * 汽车模板--服务的提供者
 **/
public class Car implements TransService{
	private  int speed;
	public Car(){
		System.out.println("创建一个汽车");
	 this.speed=10;
	}
	public void addSpeed(int s) {
		this.speed+=s;
	}
	public int getSpeed() {
		return this.speed;
	}
}
