package com.inportia;

public class MainGate  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnotherThread at = new AnotherThread();
		ThirdThread tt = new ThirdThread();
		Thread runThread = new Thread(tt);
		runThread.start();
		
		try{
			while(runThread.isAlive()){
				System.out.println("In main thread");
				Thread.sleep(1500);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	

}
