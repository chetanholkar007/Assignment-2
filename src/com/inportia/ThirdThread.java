package com.inportia;

public class ThirdThread implements Runnable {
public void run(){
		
		try{
			for(int i=0;i<10;i++){
				System.out.println("In third class method");
				Thread.sleep(1500);
			}
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
