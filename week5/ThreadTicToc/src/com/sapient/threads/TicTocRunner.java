package com.sapient.threads;

import java.util.concurrent.Semaphore;

public class TicTocRunner {
	public static void main(String[] args) {
		
		Semaphore in = new Semaphore(1);
		Semaphore out = new Semaphore(0);
		
		Tic tic = new Tic(in,out);
		Toc toc = new Toc(out,in);
		Thread tocThread = new Thread(toc);
		tic.start();
		tocThread.start();
	}
}
