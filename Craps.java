/*
Filename: Craps.java
CSC2121 Lab2 Part2
Compile as : Javac Craps.java
Run as     : Java Craps
Note: You need CrapsDice.class and SingleDie.class in your current working directory

*/
public class Craps {
	public static void main(String[] args){
		
		double percentage;
		double rollcount;
		//get the number of 2s, 3s, and 12s rolled in 752 instances.
		rollcount = playCraps(752);
		//calculate the percentage of 2s, 3s, and 12s rolled in 752 instances.
		percentage = rollcount/752*100;
		
		System.out.println("The number of 2s,3s, and 12s rolled is: "+rollcount +".");
		System.out.println("The percentage of 2s,3s, and 12s rolled is: "+percentage + "%.");
		
	}
	public static int playCraps(int numberOfRolls){
		CrapsDice thedie = new CrapsDice();
		int counter = 0;
		int currentroll;
		//For each roll check if the sum of the dice = 2, 3, or 12 and increment counter if so
		for(int i=1; i <=numberOfRolls; i++){
			currentroll = thedie.roll();
			if (currentroll == 2 || currentroll == 3 || currentroll == 12) {
				counter++;
			}
		}
		return counter;
	}
}	
