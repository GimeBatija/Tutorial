package com.blogspot.debukkitsblog.mavenTutorial;

public class HalloWelt {

	public static void main(String[] args) {
		int zahl1=5;
		int zahl2=10;
		
		//CallByValue
		addiere(zahl1, zahl2);
		System.out.println("Zahl1:"zahl1 && " Zahl2:" zahl2);
	}
	
	public static void veraenderParameter(int zahl1, int zahl2) {
		zahl1=zahl1*2;
		zahl2=zahl*2;
	}

}
