package com.it.demo;
/**
 * 
 *Title:
* Description:com.it.demo.Program.java
* Copyright:Copyright (c) j2se 8.0
* Company: zxySoft
* @author zxy
 */
public class Program {
	Performer performer[] = new Performer[5];
   /**
    * 循环迭代对象数组
    * 不为null说明有值，则打印信息
    */
	public void show(){
		for (int i = 0; i < performer.length; i++) {
			
			if(performer[i]!=null){
				performer[i].perform();
			}
			
		}
	}

}
