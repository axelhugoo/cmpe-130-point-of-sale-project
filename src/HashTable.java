
public class HashTable {
	//Variable declaration
		private int TABLE_SIZE;
		private int size;
		private HashEntry[] table;
		
		Item key;
		Item value;
		
		//Constructor
		public HashTable(int ts)
		{
			size = 0;
			TABLE_SIZE = ts;
			table = new HashEntry[TABLE_SIZE];
			
			for(int i = 0; i < TABLE_SIZE; i++)
			{
				table[i] = null;
			}
		}
		
		
		//Function for inserting element to hash table
		public void insert(Item key, Item value)
		{
			//generating the hash key to put in the bucket
			int hash = (thehash( key.getPrice() ) % TABLE_SIZE);
			if(table[hash] == null)
			{
				table[hash] = new HashEntry(key,value);
			}
			else
			{
				HashEntry entry = table[hash];
				while(entry.next != null && !entry.key.equals(key))
				{
					entry = entry.next;
				}
				if(entry.key.equals(key))
				{
					entry.value = value;
				}
				else
				{
					entry.next = new HashEntry(key,value);
				}
				size++;
			}
		}
		
		//Function for deleting element to hash table
		public void delete(Item key)
		{
			//generating the hash key to put in the bucket
			int hash = (thehash( key.getPrice() ) % TABLE_SIZE);
			if(table[hash] != null)
			{
				HashEntry previousEntry = null;
				HashEntry entry = table[hash];
				while(!entry.key.equals(key) && entry.next != null )
				{
					previousEntry = entry;
					entry = entry.next;
				}
				if(entry.key.equals(key))
				{
					if(previousEntry == null)
					{
						table[hash] = entry.next;
					}
					else
					{
						previousEntry.next = entry.next;
						size--;
					}
					System.out.println("ITEM WITH NAME: " + key.getName() + " ITEM PRICE: " + key.getPrice() + " DELETED ");
				}
			}
		}
		
		//function to search a patient's name by entering a priority ID
		public void search(Item key)
		{
			//generating the hash key to put in the bucket
			int hash = (thehash( key.getPrice() ) % TABLE_SIZE);
			if(table[hash] != null)
			{
				HashEntry prevEntry = null;
				HashEntry entry = table[hash];
				while(entry.next != null && !entry.key.equals(key))
				{
					prevEntry = entry;
					entry = entry.next;
				}
				if(entry.key.equals(key))
				{
					System.out.println("PATIENT WITH PRIORITY ID: " + key.getPrice() + " PATIENT NAME: " + key.getName() + " FOUNDED ");
				}
			}
		}
		
		//function to make a list of patients in the hash table
		public void makelist()
		{
			System.out.print("ITEM INVERTORY LIST: (ITEM NAME, ITEM PRICE, ITEM DESCRIPTION) ");
			
			//Iterate through all hash table elements
			for(int i = 0; i < TABLE_SIZE; i++)
			{
				System.out.print("\n BUCKET " + (i + 1) + " : ");
				HashEntry entry = table[i];
				while(entry != null)
				{
					System.out.print("(" + entry.value.getName() + ", " + entry.value.getPrice() + ", "+ entry.value.getNote() +")");
					entry = entry.next;
				}
			}
		}
		
		//Function to delete all element in HashTable
		public void clearList()
		{
			//Iterate through all hash table elements
			for(int i = 0; i < TABLE_SIZE; i++)
			{
				//delete all the elements inside the table
				table[i] = null;
			}
		}
		
		//private function of hashing
		private int thehash(int x) {
			//using 11 as the max number of modulus
			int hashValue = x;
			hashValue %= TABLE_SIZE;
			if(hashValue < 0)
			{
				hashValue += TABLE_SIZE;
			}
		return hashValue; 
		}
}
