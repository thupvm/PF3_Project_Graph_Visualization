package Models;

import java.util.ArrayList;

public class graphSaver {
	private ArrayList<Node> nodeArr;
	private Double[][] edgesMatrix;
	
	public graphSaver() {
		nodeArr = new ArrayList<>();
	}

	public ArrayList<Node> getNodeArr() {
		return nodeArr;
	}

	public void setNodeArr(ArrayList<Node> nodeArr) {
		this.nodeArr = nodeArr;
	}

	public Double[][] getEdgesMatrix() {
		return edgesMatrix;
	}

	public void setEdgesMatrix(Double[][] edgesMatrix) {
		this.edgesMatrix = edgesMatrix;
	}
	
	public void formEdgeMatrix() {
		
	}

}
