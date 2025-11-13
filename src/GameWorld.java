//
public class GameWorld {
	private String name;
	private Player[] players;
	private Enemy[] enemies;
	private int difficulty;

	public GameWorld() {
		this.name = "Crystalpath";
		this.players = new Player[0];
		this.enemies = new Enemy[0];
		this.difficulty = 1;
	}

	public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty) {
		this.name = name;
		this.players = players;
		this.enemies = enemies;
		if (difficulty > 3) {
			this.difficulty = 3;
			System.out.println("Difficulty above 3 is impossible - Difficulty has been set to 3");
		} else if (difficulty < 1) {
			this.difficulty = 1;
			System.out.println("Difficulty below 1 is impossible - Difficulty has been set to 1");
		} else {
			this.difficulty = difficulty;
		}
	}

	public void addPlayer(Player player) {
		Player[] newPlayers = new Player[this.players.length + 1];

		for (int i = 0; i < this.players.length; i++) {
			newPlayers[i] = this.players[i];
		}
		newPlayers[this.players.length] = player;

		this.players = newPlayers;
	}

	public void printAllPlayers() {
		for (int i = 0; i < this.players.length; i++) {
			System.out.println("-------------Player " + (i + 1) + "-------------");
			System.out.println(this.players[i].toString());
		}
	}

	public int getTotalValueOfWorld() {
		int total = 0;
		for (int i = 0; i < this.players.length; i++) {
			total += this.players[i].calculateInventoryValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "World Name: " + name + "\n" + "Difficulty: " + difficulty + "\n" + "Number of players: "
				+ this.players.length;
	}
}
