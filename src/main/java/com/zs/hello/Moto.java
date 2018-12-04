package com.zs.hello;
/**
 * moto服务的提供者
 * 也是一种继承关系
 * 父类：TransService
 * 子类：Moto
 * */
public class Moto  implements TransService {
	private  int speed;
	 public Moto() {
		System.out.println("创建一个摩托");
	 this.speed=10;
	}
	public void addSpeed(int s) {
		this.speed+=s;
		
	}
	public int getSpeed() {
		return this.speed;
	} 
}
