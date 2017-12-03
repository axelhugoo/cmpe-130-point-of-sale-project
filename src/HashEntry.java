
public class HashEntry {
	Item key;
	Item value;
	HashEntry next;
	
	//Constructor
	HashEntry(Item key, Item value)
	{
		this.key = key;
		this.value = value;
		this.next = null;
	}
}


