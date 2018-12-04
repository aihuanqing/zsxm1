package com.zs.hello;
/**
 * 交通辅助接口--契约
 * */
public interface TransService {
	//加速
	public void addSpeed(int s);
	//获得车速
	public  int getSpeed();
}
