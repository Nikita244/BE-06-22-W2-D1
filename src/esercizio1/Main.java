package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static int[] array = new int[5];

	public static void main(String[] args) {
			InputUtente nuovo = new InputUtente();
			randomNum();
			nuovo.sceltaUtente();
			
		}
		
		public static void randomNum() {
			Random num = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = num.nextInt(11); //numero random max 10
				System.out.println("Array n." + (i + 1) + " = " + array[i]);
			}

	}

}
