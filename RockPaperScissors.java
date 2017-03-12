import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Hello");

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

*/
