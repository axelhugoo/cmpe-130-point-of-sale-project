
public class BST {
	private BSTItem root;
	
	//Constructor
	public BST()
	{
		root = null;
	}
	
	//Check if the tree is empty or not
	public boolean isEmpty()
	{
		return root == null;
	}
	
	//To insert item data
	public void insert(Item theItem)
	{
		root = insert(root, theItem);
	}
	
	//The insert function
	private BSTItem insert(BSTItem node, Item theItem)
	{
		if(node == null)
		{
			node = new BSTItem(theItem);
		}
		else
		{
			if(theItem.getPrice() <= node.getPrice())
			{
				node.left = insert(node.left, theItem);
			}
			else
			{
				node.right = insert(node.right, theItem);
			}
		}
		
		return node;
	}
	
	//The delete function
	public void delete(Item theItem)
	{
		if(isEmpty())
		{
			System.out.println("Tree / Database is empty");
		}
		else if(searchBoolean(theItem) == false)
		{
			System.out.println(" The item is not in the tree/database ");
			System.out.println(theItem);
			System.out.println(" ");
		}
		else
		{
			root = delete(root, theItem);
			System.out.println("This item is DELETED from the tree: ");
			System.out.println(theItem);
		}
	}
	
	//private function for deleting item from the tree
	private BSTItem delete(BSTItem root, Item theItem)
	{
		BSTItem parent;
		BSTItem parent2;
		BSTItem node;
		
		if(root.getData() == theItem)
		{
			BSTItem leftTree; 
			BSTItem rightTree;
			
			leftTree = root.getLeft();
			rightTree = root.getRight();
			
			if(leftTree == null && rightTree == null)
			{
				return null;
			}
			else if(leftTree == null)
			{
				parent = rightTree;
				return parent;
			}
			else if(rightTree == null)
			{
				parent = leftTree;
				return parent;
			}
			else
			{
				parent2 = rightTree;
				parent = rightTree;
				while(parent.getLeft() != null)
				{
					parent = parent.getLeft();
				}
				parent.setLeft(leftTree);
				return parent2;
			}
		}
		
		if(theItem.getPrice() < root.getPrice())
		{
			node = delete(root.getLeft(), theItem);
			root.setLeft(node);
		}
		else
		{
			node = delete(root.getRight(), theItem);
		}
		return root;
	}

	//Search function return boolean value for the delete method
	public boolean searchBoolean(Item val) {
		// TODO Auto-generated method stub
		return search(root, val);
	}
	
	//Search function return the object values for the search method
	public void searchItem(Item theItem)
	{
		if(isEmpty())
		{
			System.out.println("Tree/Database is Empty");
		}
		else if(searchBoolean(theItem) == true)
		{
			System.out.println(" Here is the item you looking for: ");
			System.out.println(theItem);
			System.out.println(" ");
		}
	}
	
	//The private method of the search 
	private boolean search(BSTItem r, Item val)
	{
		boolean found = false;
		while( r != null && !found)
		{
			Item rval = r.getData();
			if(val.getPrice() < rval.getPrice())
			{
				r = r.getLeft();
			}
			else if(val.getPrice() > rval.getPrice())
			{
				r = r.getRight();
			}
			else
			{
				found = true;
				break;
			}
			found = search(r,val);
		}
		return found;
	}
	
	
	//To count how many item in the tree/database
	public int countItem()
	{
		return countItem(root);
	}
	
	//private function for the countItem
	private int countItem(BSTItem r)
	{
		if(r == null)
		{
			return 0;
		}
		else
		{
			int count = 1;
			count += countItem(r.getLeft());
			count += countItem(r.getRight());
			return count;
		}
	}
	
	//function to sort the item form the highest price to the lowest price
	public void descending()
	{
		descending(root);
	}
	
	private void descending(BSTItem r)
	{
		if(r != null)
		{
			descending(r.getRight());
			System.out.println(r.getData() + " ");
			System.out.println(" ");
			descending(r.getLeft());
		}
	}
	
	//function to sort the item form the lowest price to the highest price
	public void ascending()
	{
		ascending(root);
	}
	
	private void ascending(BSTItem r)
	{
		if(r != null)
		{
			descending(r.getLeft());
			System.out.println(r.getData() + " ");
			System.out.println(" ");
			descending(r.getRight());
		}
	}
	
}






























