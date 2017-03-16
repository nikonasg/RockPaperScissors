import java.util.Scanner;

public class RockPaperScissors {
	public static int drawGame;
	public static int computerGame;
	public static int playerGame;

	public static String name;
	public static int rounds;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		intro();
		play(rounds, name, scan);


	}
	public static void intro() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Welcome to ROCK PAPER SCISSORS. I, Computer, will be your opponent.\n" + 
			"Please type in your name and press return: ");
		name = scan.nextLine();
		System.out.println("\nWelcome " + name + ".");
		System.out.println("\nAll right " + name + ". How many rounds would you like to play?");
		System.out.print("Enter the number of rounds you want to play and press return: ");
		rounds = scan.nextInt();
		scan.nextLine();
		System.out.println();

	}
	public static void play(int rounds, String name, Scanner scan) {
		OpponentPlayer computer = new OpponentPlayer(false);

		for(int i = 0; i < rounds; i++) {
			System.out.println("Round " + (i + 1) + ".");
			System.out.println(name + ", please enter your choice for this round.");
			System.out.print("1 for ROCK, 2 for PAPER, and 3 for SCISSORS: ");
			int pick = scan.nextInt() - 1;
			scan.nextLine();
			Choice playerChoice = Choice.values()[pick];
			Choice computerChoice = computer.getChoice(playerChoice);
			System.out.println("Computer picked " +  computerChoice +  ", " + name + " picked " + playerChoice + ".");
			System.out.println();

			if(computerChoice == playerChoice) {
				drawGame++;
				System.out.println("We picked the same thing! This round is a draw.");
			}
			else if (playerChoice.ordinal() == (computerChoice.ordinal() + 1) % Choice.values().length) {
				playerGame++;
				System.out.println(name + " wins!");
			}
			else {
				computerGame++;
				System.out.println("Computer wins!");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Number of games of ROCK PAPER SCISSORS: " + rounds);
		System.out.println("Number of times Computer won: " + computerGame);
		System.out.println("Number of times " + name + " won: " + playerGame);
		System.out.println("Number of draws: " + drawGame);
		if(computerGame == playerGame) {
			System.out.println("We are evenly matched.");
		}
		else if (playerGame > computerGame) {
			System.out.println("You, " + name + ", are a master at ROCK, PAPER, SCISSORS");
		}
		else if (computerGame > playerGame) {
			System.out.println("I, Computer, am a master at ROCK, PAPER, SCISSORS");

		}
	
	}
}

enum Choice {
	ROCK, PAPER, SCISSORS;
}

class OpponentPlayer {
	final boolean isMaster;
	private int position = 0;
	private final Choice[] choices = {Choice.ROCK, Choice.PAPER, Choice.SCISSORS, Choice.PAPER, Choice.SCISSORS, Choice.ROCK, Choice.ROCK};

	OpponentPlayer(boolean isMaster) {
		this.isMaster = isMaster;
	}

	public Choice getChoice(Choice playerChoice) {
		if (isMaster) {
			//TODO implement AI here
			return null;
		}
		else {
			Choice c = choices[position];
			position = (position + 1) % choices.length;
			return c;
		}
	}
}

/*

----------------------- Using String to model weapons
class Weapon {
	String nameOfWeapon;

	Weapon(String n) {
		nameOfWeapon = n;
	}
}
Weapon nikWeapon = new Weapon("sword");
Weapon timWeapon = new Weapon("bow");
Weapon georgeWeapon = new Weapon("staff");

----------------------- Using int to model weapons
class Weapon {
	int valueOfWeapon;

	Weapon(int v) {
		valueOfWeapon = v;
	}
}
Weapon nikWeapon = new Weapon(0);
Weapon timWeapon = new Weapon(1);
Weapon georgeWeapon = new Weapon(2);

----------------------- Using enum to model weapons
enum Weapon {
	SWORD, BOW, STAFF;
}
Weapon nikWeapon = Weapon.SWORD;
Weapon timWeapon = Weapon.BOW;
Weapon georgeWeapon = Weapon.STAFF;

//You can get an array of the enums in the order they are listed
Weapon[] availableWeapons = Weapon.values(); // same as using new Weapon[] {Weapon.SWORD, Weapon.BOW, Weapon.STAFF}

//Turn enum into String or int
String stringFromEnum = nikWeapon.name(); // "SWORD"
int intFromEnum = nikWeapon.ordinal(); // 0

//Turn String or int into enum
Weapon enumFromString = Weapon.valueOf("SWORD"); // Weapon.SWORD;
Weapon enumFromint = Weapon.values()[0]; // Weapon.SWORD;

-----------------------

0 % 3 == 0
1 % 3 == 1
2 % 3 == 2

3 % 3 == 0
4 % 3 == 1
5 % 3 == 2

6 % 3 == 0
7 % 3 == 1
8 % 3 == 2

9 % 3 == 0
10 % 3 == 1
11 % 3 == 2
*/
