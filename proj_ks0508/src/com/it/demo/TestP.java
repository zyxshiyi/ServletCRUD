package com.it.demo;

public class TestP {
	public static void main(String[] args) {
		
		Program program = new Program();
		 
		//�������鸳ֵ
		for (int i = 0; i < program.performer.length; i++) {
			
			if(i==0){
				program.performer[i] = new Singer();
			}else if(i%2==0){
				program.performer[i] = new Dancer();
			}else{
				program.performer[i] = new Player();
			}
			
			
		}
		//���÷���
		program.show();
	}

}
