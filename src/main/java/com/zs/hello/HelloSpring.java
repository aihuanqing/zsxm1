
package com.zs.hello;
/**
 * 普通类
 * @author Administrator
 */
public class HelloSpring {
	//属性
	private String ename;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	//构造函数
	public HelloSpring(){
		System.out.println("创建了一个对象");
	}
    //方法
	public void hello(){
		System.out.println( ename+" 你好");
	}
}
