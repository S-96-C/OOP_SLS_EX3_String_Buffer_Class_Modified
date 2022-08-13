import java.util.Scanner;

public class Main {
	static int itemCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Print Cart \t 2. exit \t 3. Add Item \t 4. Remove Item \t 5. Buy");
		//Add Any Code if needed Here
	}
	private static String addItem(){
		itemCount++;
		//Add Any Code if needed Here
		return "New Item Added \n";
	}
	private static String removeItem(){
		itemCount--;
		//Add Any Code if needed Here
		return "Item removed \n";
	}
	private static String exit(){
		//Add Any Code if needed Here
		return "Exiting Without buying \n";
	}
	private static String print(){
		//Add Any Code if needed Here
		return "Cart Has "+itemCount+" Items \n";
	}
	private static String buy(){
		//Add Any Code if needed Here
		return "Buying "+itemCount+" Items \n";
	}
}

/*
package q3;

import java.awt.print.Printable;
import java.util.Scanner;

public class Scenario2 {
	static int itemCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Print Cart \t 2. exit \t 3. Add Item \t 4. Remove Item \t 5. Buy");
		int input;
		StringBuffer log = new StringBuffer();
		while(true){
			input = sc.nextInt();
			switch(input){
			case 1:
				String s = print();
				log.append(s);
				System.out.print(s);
				break;
			case 2:
				log.append(exit());
				System.out.println(log);
				break;
			case 3:
				log.append(addItem());
				break;
			case 4:
				log.append(removeItem());
				break;
			case 5:
				log.append(buy());
				System.out.println(log);
				break;
			}
		}

	}
	private static String addItem(){
		itemCount++;
		return "New Item Added \n";
	}
	private static String removeItem(){
		itemCount--;
		return "Item removed \n";
	}
	private static String exit(){
		return "Exiting Without buying \n";
	}
	private static String 
private static String exit(){
		return "Exiting Without buying \n";
	}
	private static String print(){
			
		return "Cart Has "+itemCount+" Items \n";
	}
	private static String buy(){
		
		return "Buying "+itemCount+" Items \n";
	}
}

package q3;

import java.awt.print.Printable;
import java.util.Scanner;

public class Scenario3 {
	static int itemCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Print Cart \t 2. exit \t 3. Add Item \t 4. Remove Item \t 5. Buy");
		String input; ;
		StringBuffer log = new StringBuffer();
		while(true){
			input = sc.nextLine();
			input = input.toLowerCase();
			input = input.replaceAll("\\s", "");
			switch(input){
			case "printcart":
				String s = print();
				log.append(s);
				System.out.print(s);
				break;
			case "exit":
				log.append(exit());
				System.out.println(log);
				break;
			case "additem":
				log.append(addItem());
				break;
			case "removeitem":
				log.append(removeItem());
				break;
case "buy":
				log.append(buy());
				System.out.println(log);
				break;
			}
		}

	}
	private static String addItem(){
		itemCount++;
		return "New Item Added \n";
	}
	private static String removeItem(){
		itemCount--;
		return "Item removed \n";
	}
	private static String exit(){
		return "Exiting Without buying \n";
	}
	private static String print(){
			
		return "Cart Has "+itemCount+" Items \n";
	}
	private static String buy(){
		
		return "Buying "+itemCount+" Items \n";
	}
}



*/