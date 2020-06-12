package com.sapient.threads;

import java.util.concurrent.Semaphore;

public class Toc implements Runnable {
	
	private Semaphore in;
	private Semaphore out;
	public Toc(Semaphore in,Semaphore out) {
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
			System.out.println("TOC");
			out.release();
		}
			
	}

}
