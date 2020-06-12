package com.sapient.threads;

import java.util.concurrent.Semaphore;

public class Tic extends Thread {
	private Semaphore in,out;
	Tic(Semaphore in,Semaphore out){
		this.in = in;
		this.out = out;
	}
	public void run() {
		for(int i = 0;i<11;i++) {
			try {
				in.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tic");
			out.release();
		}
			
	}
}
