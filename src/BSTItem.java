
public class BSTItem {
	BSTItem left;
	BSTItem right;
	Item theItem;
	
	
	//Constructor
	public BSTItem()
	{
		left = null;
		right = null;
		theItem = null;
	}
	
	//Constructor
	public BSTItem(Item n)
	{
		left = null;
		right = null;
		theItem = n;
	}
	
	//Setting up the left node
	public void setLeft(BSTItem n)
	{
		left = n;
	}
	
	//Setting up the right node
	public void setRight(BSTItem n)
	{
		right = n;
	}
	
	//Getting the left node
	public BSTItem getRight()
	{
		return right;
	}
	
	//Getting the right node
	public BSTItem getLeft()
	{
		return left;
	}
	
	//Set data about the item info
	public void setData(Item i)
	{
		theItem = i;
	}
	
	//Get data from the node
	public Item getData()
	{
		return theItem;
	}
	
	//Get Price from the object
	public int getPrice()
	{
		return theItem.getPrice();
	}
	
	//Get Name from the object
	public String getName()
	{
		return theItem.getName();
	}
	
	//Get Info from the object
	public String getInfo()
	{
		return theItem.getNote();
	}
}
