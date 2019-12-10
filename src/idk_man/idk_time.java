package idk_man;

import java.util.Scanner;

public class idk_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementing stuff from previous work into one thing. A test kind of.
		
		//A K A, battlesim bs with word s(tuff)hit.
	
		
		
		
		String weapon ="nothing";
		
		while (weapon=="nothing") {
		System.out.println("Choose a weapon...Or not...");
		//testing out how a variable of a weapon would impact battle to make 'fun' happen
		System.out.println("  ");
		System.out.println("Options:");
		System.out.println("> Pencil");
		System.out.println("> Hands");
		System.out.println("> Dog ");
		System.out.println("  ");
		System.out.println("     hint: add a '?' to the end of your ");
		System.out.println("     response for stat information on said weapon.");
			
		Scanner in=new Scanner(System.in);
		
		weapon =in.nextLine();
		//stats for weapons are:
		//attack: how much damage can be dealt. 
		//speed: idk seems neat to add a dodging mechanism where enemy can dodge attacks
		//crit cahnce: chance of critical attack? aka damage can be randomized for some.
		
	
		if (weapon.equalsIgnoreCase("pencil?"))
		System.out.println("eeeeeeee");
		
		}
		

	}

}

	

