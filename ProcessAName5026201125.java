import java.util.Scanner;
public class ProcessAName5026201125 {
	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
		System.out.print("Type your name :");
		String nama = in.nextLine();
		int idx = nama.indexOf(' ');
		String surName = nama.substring(idx+1 , nama.length());
		
		System.out.println("Type your name :" + nama + 
		"\n" + idx + 
		"\nYour Name is :" + surName + "," + nama.charAt(0));
	}
}