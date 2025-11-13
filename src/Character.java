
public class Character {
	private String name;
	private int health;
	private int level;

	public Character() {
		this.name = "Unknown";
		this.health = 0;
		this.level = 0;
	}

	public Character(String name, int health, int level) {
		this.name = name;
		if (health > 10) {
			this.health = 10;
			System.out.println("Health above 10 is impossible - Health has been set to 10");
		} else if (health < 0) {
			this.health = 0;
			System.out.println("Health below 0 is impossible - Health has been set to 0");
		} else {
			this.health = health;
		}

		if (level > 5) {
			this.level = 5;
			System.out.println("Level above 5 is impossible - Level has been set to 5");
		} else if (level < 0) {
			this.level = 0;
			System.out.println("Level below 0 is impossible - Level has been set to 0");
		} else {
			this.level = level;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public int getLevel() {
		return this.level;
	}

	public void levelUp() {
		if (this.level == 5) {
			System.out.println("Max level reached - cant level up");
		} else {
			this.level++;
		}
	}

	public void heal(int amount) {
		if (this.health + amount >= 10) {
			this.health = 10;
		} else {
			this.health += amount;
		}
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\n" + "Health: " + this.health + "\n" + "Level: " + this.level;
	}
}
