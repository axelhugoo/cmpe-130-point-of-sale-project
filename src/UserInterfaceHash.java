import java.util.*;

public class UserInterfaceHash {
	private static Scanner scan;
	
	public static void main(String[] args)
	{
		
		Header();
		
		char ch = 0;
		scan = new Scanner(System.in);

		//To initialize the hash table size
		System.out.print(" ENTER THE HASH TABLE SIZE: ");
		
		HashTable hashtab = new HashTable(scan.nextInt());
		System.out.println(" ");
		
		//Initialize arrayList to store the Item object
		ArrayList<Item> items = new ArrayList<Item>();
		
		do
		{
			Option();
			int choice = scan.nextInt();
			switch(choice)
			{
			//1. INSERT NEW ITEM INFOMARTION
			case 1:
				Scanner in = new Scanner(System.in);
				System.out.println(" ");
				
				
				System.out.println(" INSERT NEW ITEM INFOMARTION ");
				
				System.out.print(" --- Please insert the item NAME: ");
				String name = in.next();
				
				System.out.print(" --- Please insert the item PRICE: ");
				int price = in.nextInt();
				
				System.out.print(" --- Please insert the item DESCRIPTION: ");
				String desc = in.next();
				
				Item goods = new Item(price, name, desc);
				
				hashtab.insert(goods,goods);
				items.add(goods);
				System.out.println(" ");
				
				System.out.print("Do you want to continue (Type y or n): ");
				ch = scan.next().charAt(0);
				System.out.println(" ");
				
				break;
				
			//2. DELETE THE ITEM 
			case 2:
				
				System.out.println(" ");
				
				System.out.println(" DELETE THE ITEM  ");
				System.out.println(" ");
				System.out.println("    1. DELETE BY ITEM NAME ");
				System.out.println("    2. DELETE BY ITEM PRICE ");
				System.out.println(" ");
				System.out.print(" PLEASE INSERT YOUR CHOICE: ");
				
				int deleteChoice = scan.nextInt();
				switch (deleteChoice)
				{
				//DELETE BY ITEM NAME
				case 1:
					System.out.print(" DELETE ITEM BY NAME: ");
					Scanner itemName = new Scanner(System.in);
					String deleteName = itemName.nextLine();
					
					for(int i = 0; i < items.size(); i++)
					{
						if(items.get(i).getName().equals(deleteName))
						{
							hashtab.delete(items.get(i));
							items.remove(i);
						}
						if(!items.get(i).getName().equals(deleteName) && i == items.size()-1)
						{
							System.out.println("NO ITEM WITH THAT NAME");
						}
					}
					
					System.out.print(" Do you want to continue (Type y or n): ");
					ch = scan.next().charAt(0);
					System.out.println(" ");
					
					break;
					
				//DELETE BY ITEM PRICE
				case 2:
					
					System.out.println(" DELETE ITEM BY PRICE: ");
					Scanner itemPrice = new Scanner(System.in);
					int deletePrice = itemPrice.nextInt();
					for(int i = 0; i < items.size(); i++)
					{
						if(items.get(i).getPrice() == deletePrice)
						{
							hashtab.delete(items.get(i));
							items.remove(i);
						}
						if(items.get(i).getPrice() != deletePrice && i == items.size()-1)
						{
							System.out.println("NO ITEM WITH THAT NAME");
						}
					}
					
					System.out.print(" Do you want to continue (Type y or n): ");
					ch = scan.next().charAt(0);
					System.out.println(" ");
					
					break;
				}
				
			//3. SEARCH THE ITEM INFORMATION
			case 3:
				System.out.println(" ");
				
				System.out.println(" SEARCH THE ITEM INFORMATION ");
				System.out.println(" ");
				System.out.println("    1. SEARCH BY ITEM NAME ");
				System.out.println("    2. SEARCH BY ITEM PRICE ");
				System.out.println(" ");
				System.out.print(" PLEASE INSERT YOUR CHOICE: ");
				
				int searchChoice = scan.nextInt();
				switch (searchChoice)
				{
				//SEARCH BY ITEM NAME
				case 1:
					System.out.print(" SEARCH ITEM BY NAME: ");
					Scanner itemName = new Scanner(System.in);
					String searchName = itemName.nextLine();
					
					for(int i = 0; i < items.size(); i++)
					{
						if(items.get(i).getName().equals(searchName))
						{
							hashtab.search(items.get(i));
						}
						if(!items.get(i).getName().equals(searchName) && i == items.size()-1)
						{
							System.out.println("NO ITEM WITH THAT NAME");
						}
					}
					
					System.out.print(" Do you want to continue (Type y or n): ");
					ch = scan.next().charAt(0);
					System.out.println(" ");
					
					break;
					
				//SEARCH BY ITEM PRICE
				case 2:
					System.out.println(" SEARCH ITEM BY PRICE: ");
					Scanner itemPrice = new Scanner(System.in);
					int searchPrice = itemPrice.nextInt();
					for(int i = 0; i < items.size(); i++)
					{
						if(items.get(i).getPrice() == searchPrice)
						{
							hashtab.search(items.get(i));
						}
						if(items.get(i).getPrice() != searchPrice && i == items.size()-1)
						{
							System.out.println("NO ITEM WITH THAT NAME");
						}
					}
					
					System.out.print(" Do you want to continue (Type y or n): ");
					ch = scan.next().charAt(0);
					System.out.println(" ");
					
					break;
				}
				
			case 4:
				hashtab.makelist();
				
				System.out.println(" ");
				System.out.print("Do you want to continue (Type y or n): ");
				ch = scan.next().charAt(0);
				System.out.println(" ");
				
				break;
			}
		}
		while(ch == 'Y' || ch == 'y');
		
	}
	
	static void Header()
	{
		System.out.println("====================================================================");
		System.out.println("====================================================================");
		System.out.println("  CMPE 130 FINAL PROJECT POINT OF SALE APPLICATION USING HASH MAP  ");
		System.out.println("====================================================================");
		System.out.println("====================================================================");
		System.out.println("");
	}
	
	static void Option()
	{
		System.out.println("POINT OF SALE in BST");
		System.out.println("1. INSERT NEW ITEM ");
		System.out.println("2. DELETE THE ITEM ");
		System.out.println("3. SEARCH THE ITEM  ");
		System.out.println("4. LIST THE ITEM IN INVENTORY");
		System.out.println("5. QUIT");
		System.out.println("");
		System.out.print("PLEASE INPUT YOUR OPTION : ");
	}
}
