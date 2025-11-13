
public class Player extends Character {

	private Item[] inventory;

	public Player(String name, int health, int level) {
		super(name, health, level);
		this.inventory = new Item[0];

	}

	public Player(String name, int health, int level, Item[] inventory) {
		super(name, health, level);
		this.inventory = inventory;
	}

	public void addItem(Item item) {
		Item[] newInv = new Item[this.inventory.length + 1];

		for (int i = 0; i < this.inventory.length; i++) {
			newInv[i] = this.inventory[i];
		}
		newInv[this.inventory.length] = item;

		this.inventory = newInv;
	}

	public int calculateInventoryValue() {
		int total = 0;
		for (int i = 0; i < this.inventory.length; i++) {
			total += this.inventory[i].getValue();
		}
		return total;
	}

	public boolean hasMagicalItem() {
		for (int i = 0; i < this.inventory.length; i++) {
			if (this.inventory[i].isMagical()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String inventoryItems = "";

		if (this.inventory.length == 0)
			return super.toString() + "\nInventory: " + "Empty";
		for (int i = 0; i < this.inventory.length; i++) {
			inventoryItems += this.inventory[i].getName();

			if (i < this.inventory.length - 1) {
				inventoryItems += " | ";
			}
		}
		return super.toString() + "\nInventory: " + inventoryItems + "\n" + "Inventory value: "
				+ calculateInventoryValue();
	}
}
