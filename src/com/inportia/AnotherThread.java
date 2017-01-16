package com.inportia;

public class AnotherThread extends Thread{

	AnotherThread()
	{
		start();
	}
	public void run(){
		
		try{
			for(int i=0;i<10;i++){
				System.out.println("In run method");
				Thread.sleep(1500);
			}
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
