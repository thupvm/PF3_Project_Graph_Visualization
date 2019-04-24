package Models;

public class Node {
	private double valueX;
	private double valueY;

	public Node(double valueX, double valueY) {
		super();
		this.valueX = valueX;
		this.valueY = valueY;
	}

	public double getValueX() {
		return valueX;
	}

	public void setValueX(double valueX) {
		this.valueX = valueX;
	}

	public double getValueY() {
		return valueY;
	}

	public void setValueY(double valueY) {
		this.valueY = valueY;
	}

	@Override
	public String toString() {
		return "Node [valueX=" + valueX + ", valueY=" + valueY + "]";
	}

}
