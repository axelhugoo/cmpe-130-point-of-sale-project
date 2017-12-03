
public class Item {
	
	 String itemName;
	 int itemPrice;
	 String itemNotes;
	
	Item(int price, String name, String notes)
	{
		itemName = name;
		itemPrice = price;
		itemNotes = notes;
	}
	
	public int getPrice()
	{
		return itemPrice;
	}
	
	public String getName()
	{
		return itemName;
	}
	
	public String getNote()
	{
		return itemNotes;
	}
	
	public String toString()
	{
		return " Item Name: " + itemName + "\n Item Price: " + itemPrice +"\n Item Description: " +  itemNotes;
	}
}
