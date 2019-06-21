package com.it.demo;

public class TestP {
	public static void main(String[] args) {
		
		Program program = new Program();
		 
		//对象数组赋值
		for (int i = 0; i < program.performer.length; i++) {
			
			if(i==0){
				program.performer[i] = new Singer();
			}else if(i%2==0){
				program.performer[i] = new Dancer();
			}else{
				program.performer[i] = new Player();
			}
			
			
		}
		//调用方法
		program.show();
	}

}
