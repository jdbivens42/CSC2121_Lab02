import java.util.PriorityQueue;

//Sort is not stable because heap sort uses swapping
	//Thus, duplicates are not necessarily in FIFO order
public class PQDriver {

	public static void main (String [] args) {
		//Make PriorityQueue. i.e. : PriorityQueue pq = new PriorityQueue();
		
		//Copied straight from instructions

		insertCD(pq, createCD("The Gallery", "Dark Tranquillity")); 
		insertCD(pq, createCD("Since the Day It All Came Down", "Insomnium")); 
		insertCD(pq, createCD("If Emotions Still Burn", "Ablaze My Sorrow")); 
		insertCD(pq, createCD("Swamplord", "Kalmah")); 
		insertCD(pq, createCD("Towards the Twilight", "Night in Gales")); 
		insertCD(pq, createCD("An Epic Defiance", "Detonation")); 
		insertCD(pq, createCD("From Your Grave", "The Absence")); 
		insertCD(pq, createCD("Inhumanity", "Mors Principium Est")); 
		insertCD(pq, new CD("The Gallery", "Dark Tranquillity", 13.99, 11)); //a "duplicate" with a different value and tracks 
		insertCD(pq, createCD("Timeless Departure", "Skyfire")); 
		insertCD(pq, createCD("Spirits and August Light", "Omnium Gatherum")); 
		insertCD(pq, createCD("Slaughter of the Soul", "At the Gates")); 
		insertCD(pq, createCD("Shadows and Dust", "Kataklysm")); 
		insertCD(pq, createCD("Fate of Norns", "Amon Amarth")); 
		insertCD(pq, createCD("Corroding From Inside", "Searing Meadow")); 
		insertCD(pq, createCD("The Glorious Burden", "Iced Earth")); 
		insertCD(pq, createCD("Stained", "Imperanon")); 
		insertCD(pq, createCD("As Night Conquers Day", "Autumn Leaves")); 

		//Loop until pq is empty, dequeue each CD and print it

		//will look something like: 
		
		/*	
			
			while (pq.size() > 0)
				System.out.println(pq.poll()); //poll comes from API documentation. see hyperlink
		*/
	}

	//create and return a CD but assign a default value ($14.99) and a default number of tracks (10) to each CD
	
	public static CD createCD(String title, String artist) {

		return new CD(title, artist, 14.99, 10); //Filled in constructor args with given "default" values of 14.99 and 10
	}

	//put the CD on the priority queue

	public static void insertCD(PriorityQueue pq, CD cd) {
		/*http://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html states that "insertion"
		  is performed by .offer */

		pq.offer(cd);
	
	}
}