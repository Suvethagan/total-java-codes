package Assignment.java;

import java.util.Scanner;

public class PointOfSale {
	private static final boolean Expression = false;
	static String POS[][] = new String[10][3];
	static String Product[][] = new String[100][4];
	static Scanner write = new Scanner(System.in);

	public static void main(String[] args) {
		DisplaySystem();
		LogInMethod();
		ThingsList();
	}

	public static void DisplaySystem() {
		System.out.println("\n" + "       -------------------------------" + "\n" + "          Welcome to POS LogIn :\n"
				+ "       -------------------------------");
	}

	public static void LogInMethod() {
		String adminpassword = "1111";// only for Admin Use
		char TryAgain = 'Y';// when the user enter wrong password it will ask
		// int x;
		System.out.println("\n \n[A] Admin Log In:\n" + "[C]Cashier Log In:\n" + "[E]End:\n \n" + "Log In :");
		String LogIn = write.next();
		if(LogIn.length() == 1) {
			char LogInChar = LogIn.charAt(0);
			if (LogInChar == 1) {
				do{
					System.out.println("\nEnter Admin Password :");
					String Password = write.next();
					if(Password.equals(adminpassword)) {
						Admin();
					}else {
						System.out.println("\nIncorrect Admin Password");
					}
					do {
						System.out.println("\n Do You Want To TryAgain? (Y/N): ");
						String TryAgainString = write.next();
						if(TryAgainString.length() == 1) {
					}
					do
				}
			}
		}
	

	private static void Admin() {
		// TODO Auto-generated method stub
		
	}

	private static void ThingsList() {

	}
}
