package com.monocept.model;

public class Board {
	private Cell[] cell = new Cell[9];

	public Board(Cell[] cell) {
		this.cell = cell;
	}

	public Board() {
		for (int i = 0; i < 9; i++) {
			cell[i] = new Cell();
		}
	}

	public boolean isBoardEmpty() {
		for (int i = 0; i < 9; i++) {
			if (cell[i].getMark() != MarkType.EMPTY) {
				return false;
			}
		}
		return true;
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 9; i++) {
			if (cell[i].isCellEmpty())
				return false;
		}
		return true;
	}

	public Cell[] getCells() {
		return cell;
	}

	public void setCellMark(int loc, MarkType mark) {
		if (loc >= 0 && loc < 9) {
			if (cell[loc].getMark() == MarkType.EMPTY) {
				cell[loc].setMarkType(mark);
			} else
				throw new CellAlreadyMarkException("Full");
		} else
			throw new InvalidCellLocationException("Invalid cell location");
	}

	public MarkType getCellType(int loc) {
		return cell[loc].getMark();
	}

}
