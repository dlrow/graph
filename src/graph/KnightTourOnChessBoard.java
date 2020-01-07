package graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Cell {
	int x;
	int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class KnightTourOnChessBoard {
	public static void main(String[] args) {
		getKnightTourCells(new Cell(0, 0));
	}

	private static void getKnightTourCells(Cell cell) {
		Stack<Cell> s = new Stack<>();
		Set<Cell> visited = new HashSet<>();
		s.push(cell);
		while(!s.isEmpty()) {
			
		}

	}

}
