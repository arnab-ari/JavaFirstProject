package com.sapient.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplayFilesRunner {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory path");
		String dir = sc.nextLine();
		Files.list(Paths.get(dir)).forEach(System.out::println);
	}
}
