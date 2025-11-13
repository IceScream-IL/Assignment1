//
public class Enemy extends Character {
	private int damage;

	public Enemy(String name, int health, int level, int damage) {
		super(name, health, level);
		if (damage > 5) {
			this.damage = 5;
			System.out.println("Damage above 5 is impossible - Damage has been set to 5");
		} else if (health < 1) {
			this.damage = 1;
			System.out.println("Damage below 1 is impossible - Damage has been set to 1");
		} else {
			this.damage = damage;
		}
	}

	public int getDamage() {
		return this.damage;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Damage: " + this.damage;
	}
}
