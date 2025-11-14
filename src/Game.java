
public class Game {
	public static void main(String[] args) {

		Item Knife = new Item("Karambit", 350, false);
		Item Sword = new Item("Emperor Sword", 1500, true);
		Item nightvision = new Item("Nightvision Goggles", 124, false);

		Player Posty = new Player("Posty", 10, 5);
		Player Yossi = new Player("Yossi", 10, 2);
		Player Swagg = new Player("Swagg", 10, 4);

		Posty.addItem(Sword);
		Posty.addItem(Knife);
		Posty.addItem(nightvision);
		Yossi.addItem(Knife);
		Swagg.addItem(nightvision);
		Swagg.addItem(Knife);

		Enemy Zombie = new Enemy("Zombie", 10, 3, 3);

		Player[] players = new Player[3];
		players[0] = Posty;
		players[1] = Yossi;
		players[2] = Swagg;

		Enemy[] enemies = new Enemy[1];
		enemies[0] = Zombie;

		GameWorld Rust = new GameWorld("Rust", players, enemies, 3);

		Rust.printAllPlayers();
		
		simulateBattle(Posty, Zombie);
		simulateBattle(Swagg, Zombie);
		simulateBattle(Yossi, Zombie);

	}

	public static void simulateBattle(Player player, Enemy enemy) {
		System.out.println("\n" + player.getName() + " - level: " + player.getLevel() + " VS " + enemy.getName() + " - level: "
				+ enemy.getLevel());

		if (player.getLevel() > enemy.getLevel()) {
			player.levelUp();
			System.out.println(player.getName() + " wins!");
		} else if(player.getLevel() < enemy.getLevel()) {
			enemy.levelUp();
			System.out.println(enemy.getName() + " wins!");
		} else {
			System.out.println("Its a tie!");
		}
	}
}