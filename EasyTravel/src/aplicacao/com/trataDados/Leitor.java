package com.trataDados;

import java.util.Scanner;

public class Leitor {

    private Scanner inputData;
	private Scanner inputData2;
	private Scanner inputData3;
	private Scanner inputData4;

	public double leDouble() {
		inputData4 = new Scanner(System.in);
		return 	inputData4.nextDouble();
	}
	public float leFloat() {
		inputData3 = new Scanner(System.in);
		return 	inputData3.nextFloat();
	}
	
	public int leInteiro() {
		inputData2 = new Scanner(System.in);
		return 	inputData2.nextInt();
	}
	
	public String leNome() {
		inputData = new Scanner(System.in);
		return inputData.nextLine();
	}
}
