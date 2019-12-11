package idk_man;

import java.util.Random;
import java.util.Scanner;

public class idk_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementing stuff from previous work into one thing. A test kind of.

		//A K A, battlesim bs with word s(tuff)hit.
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);	

		int attack = 20;
		int speed = 6;
		int crit = 5;

		String weapon="nothing";

		while (weapon=="nothing") {
			System.out.println("Choose a weapon...Or not...");
			//testing out how a variable of a weapon would impact battle to make 'fun' happen
			System.out.println("  ");
			System.out.println("Options:");
			System.out.println("> Pencil");
			System.out.println("Fastest weapon. Stabbyiest weapon.");
			System.out.println("> Hands");
			System.out.println("You hopefully already have these.");
			System.out.println("> Dog ");
			System.out.println("  ");




			weapon =in.nextLine(); 
			//stats for weapons are:
			//attack: how much damage can be dealt. 
			//speed: idk seems neat to add a dodging mechanism where enemy can dodge attacks
			//crit cahnce: chance of critical attack? aka damage can be randomized for some.


			if (weapon.equalsIgnoreCase("pencil")) {
				weapon="pencil";
				speed=(speed+4);
				System.out.println("You chose: Pencil.");
			}

			else if (weapon.equalsIgnoreCase("hands")) {
				weapon="hands";
				attack=(attack+20);
				System.out.println("You chose: Hands.");
			}

			else if (weapon.equalsIgnoreCase("dog")) {
				weapon="dog";
				crit=(crit+4);
				System.out.println("You chose: Dog.");
			}



		}

		int EnemyHealth = 100;

		int PlayerHealth = 120; 
		
		int EnemyAttack = (rnd.nextInt((30-10)+1)+10);

		String PlayerAttack = null;
		System.out.println("Attack with W and enter!");
		System.out.println("Defend with space and enter.");

		while (EnemyHealth>0&&PlayerHealth>0) {
			System.out.println("Current Enemy Health:");
			System.out.println(EnemyHealth);
			System.out.println(" ");
			System.out.println("Current Player Health:");
			System.out.println(PlayerHealth);

			//When attacks are done, it should deplete enemy health accordingly
			PlayerAttack = in.nextLine();

			if (PlayerAttack=="W") {
				EnemyHealth=(EnemyHealth-attack);
			}
			
			if (PlayerAttack==" ") {
				PlayerHealth=(PlayerHealth+(EnemyAttack-((rnd.nextInt((20-5)+1)+5))));
			}
			
			PlayerHealth=(PlayerHealth-EnemyAttack);
		System.out.println("  ");
		System.out.println("  ");
			System.out.println("The enemy attacked with");
			System.out.println(EnemyAttack);
			System.out.println("damage!");
			System.out.println("  ");
			
	




			//Trying to make enemy attack back every turn, but with a random number of damage between 200-40.

			//else 
			//PlayerHealth = PlayerHealth - (rnd.nextInt(200-40)-40);
		}
	}


	


}





