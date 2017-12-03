
import java.util.Scanner;

public class UserInterfaceOption {
	
	public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println(" CMPE 130 FINAL PROJECT ");
		System.out.println(" POINT OF SALE INVENTORY SYSTEM");
		System.out.println(" IMPLEMENTING BST AND HASH MAP");
		System.out.println(" ");
		
		char ch = 0;
	
		option();
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(" ");
			UserInterfaceHash.main(args);
					
			break;
			
		case 2:
			System.out.println(" ");
			UserInterfaceBST.main(args);			
			
			break;
		}

		
	}
	
	static void option()
	{
		System.out.println(" ");
		System.out.println(" PLEASE INSERT WHAT METHOD DO YOU WANT TO USE");
		System.out.println(" 1. HASH MAP(INSERT, SEARCH, DELETE) ");
		System.out.println(" 2. BINARY SEARCH TREE(INSERT, SEARCH, DELETE + SORT BY PRICE) ");
		System.out.println(" *** RESTART THE PROGRAM TO SWITCH TO OTHER METHOD *** ");
		System.out.print(" INPUT: ");
	}
}
