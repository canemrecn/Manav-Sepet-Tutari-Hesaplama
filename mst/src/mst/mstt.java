package mst;

import java.util.Scanner;

public class mstt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double salatalik = 3.14;
		double elma = 4.11;
		double kabak = 2.22;
		double domates = 0.95;
		double patlican = 7.00;
		
		System.out.print("Salatalik Kac Kilo: ");
		double salatalikKilo = scanner.nextDouble();
		
		System.out.print("Elma Kac Kilo: ");
		double elmaKilo = scanner.nextDouble();
		
		System.out.print("Kabak Kac Kilo: ");
		double kabakKilo = scanner.nextDouble();
		
		System.out.print("Domates Kac Kilo: ");
		double domatesKilo = scanner.nextDouble();
		
		System.out.print("Patlican Kac Kilo: ");
		double patlicanKilo = scanner.nextDouble();
		
		double toplam = (salatalik * salatalikKilo) + (elma * elmaKilo) + (kabak * kabakKilo) + (domates * domatesKilo) + (patlican * patlicanKilo);
		System.out.println(toplam);
	}

}
