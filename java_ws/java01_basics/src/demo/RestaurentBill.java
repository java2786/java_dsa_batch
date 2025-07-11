package demo;

import java.util.Scanner;

public class RestaurentBill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		int dosaPrice = 50;
		int idliPrice = 25;
		
		System.out.println("******** Our menu ********");
		System.out.println("1. Dosa \t- \tRs "+dosaPrice+"/-");
		System.out.println("2. Idli \t- \tRs "+idliPrice+"/-");
		
		System.out.println("Enter your order quantity for");
		System.out.print("\tDosa: ");
		int dosaQuantity = scanner.nextInt();
		
		System.out.print("\tIdli: ");
		int idliQuantity = scanner.nextInt();
		
		System.out.println("====="+name+"'s Bill=====");
		
		System.out.println("Dosa: "+dosaQuantity+"x Rs "+dosaPrice+" = "+(dosaPrice*dosaQuantity));
		System.out.println("Idli: "+idliQuantity+"x Rs "+idliPrice+" = "+(idliPrice*idliQuantity));
		
		System.out.println("============");
		
		System.out.println("Total Bill: "+((dosaPrice*dosaQuantity)+(idliPrice*idliQuantity)));
		
		System.out.println("******** Thank You ********");
		
	}
}
