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
    * ѭ��������������
    * ��Ϊnull˵����ֵ�����ӡ��Ϣ
    */
	public void show(){
		for (int i = 0; i < performer.length; i++) {
			
			if(performer[i]!=null){
				performer[i].perform();
			}
			
		}
	}

}
