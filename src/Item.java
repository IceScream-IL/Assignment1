public class Item {
	private String name;
	private int value;
	private boolean isMagical;

	public Item() {
		this.name = "Unknown";
		this.value = 0;
		this.isMagical = false;
	}

	public Item(String name, int value, boolean isMagical) {
		this.name = name;
		this.value = value;
		this.isMagical = isMagical;
	}

	@Override
	public String toString() {
		String magicalStatus = isMagical ? "Magical item" : "Regular item";
		return "Name: " + this.name + "\n" + "Value: " + this.value + "\n" + magicalStatus;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		if (value < 0) {
			this.value = 0;
		} else {
			this.value = value;
		}
	}

	public boolean isMagical() {
		return this.isMagical;
	}

	public String getName() {
		return this.name;
	}
}
