package sample.naming;

interface Traversable {
	void traverse();
}

public class Canal implements Traversable {

	public static final int DEFAULT_WIDTH = 40;
	private String id;
	protected int distance;
	private boolean isClosed = false;

	public Canal(String id) {
		// Calls the other constructor
		this(id, DEFAULT_WIDTH);
	}

	public Canal(String id, int distance) {
		this.id = id;
		this.distance = distance;
	}
	public void traverse() {
		System.out.println("Traversing: " + id + ", distance: " + distance);
	}

	public String getId() {
		return id;
	}

	// Boolean getters should start with "is" instead of "get"
	public boolean isClosed() {
		return isClosed;
	}

	/* Other stuff */

	String gateId = null;

	public boolean hasGate() {
		return gateId != null;
	}

	int cursor = 0;

	public int index() {
		return cursor;
	}

	public int addInts(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	public void processOrder(String customerName, String shippingAddress, String billingAddress, String productName,
							 int quantity, double price, boolean isExpressShipping) {
		// Method implementation
	}
}
