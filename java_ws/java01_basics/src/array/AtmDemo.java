package array;

import java.util.Scanner;

public class AtmDemo {
	public static void main(String[] args) {
		String[] names = {"Ramesh", "Dinesh", "Mahesh"};
		String[] pwds = {"ram@123", "dine@321", "mahi@1122"};
		int[] balances = {15000, 31000, 120};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String username = scanner.nextLine();
		System.out.print("Enter your password: ");
		String userpwd = scanner.nextLine();
		int foundAt = -1;
		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
			if(names[i].equals(username)) {
				foundAt = i;
				break;
			}
		}
		if(foundAt < 0) {
			System.out.println("User not found");
		} else if(pwds[foundAt].equals(userpwd)) {
			System.out.println("Press 1 to see bal");
			System.out.println("Press 2 to debit");
			System.out.println("Press 3 to change password");
			System.out.println("Press 4 to exit");

			String choice = scanner.nextLine();
			switch(choice) {
			case "1":
				System.out.println(balances[foundAt]);
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
				default:
					System.out.println("Invalid choice");
			}
			
		} else {
			System.out.println("Password is not matched");
		}
		
		
	}
}
