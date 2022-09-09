package com.monocept.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer(Board board) {
		this.board = board;
		this.result = ResultType.PROGRESS;
	}

	private void horizontalWinCheck() {
		if (board.getCellType(0) == board.getCellType(1) && board.getCellType(1) == board.getCellType(2)
				&& board.getCellType(2) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}

		if (board.getCellType(3) == board.getCellType(4) && board.getCellType(4) == board.getCellType(5)
				&& board.getCellType(5) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}
		if (board.getCellType(6) == board.getCellType(7) && board.getCellType(7) == board.getCellType(8)
				&& board.getCellType(8) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}

	}

	private void verticalWinCheck() {
		if (board.getCellType(0) == board.getCellType(3) && board.getCellType(3) == board.getCellType(6)
				&& board.getCellType(6) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}

		if (board.getCellType(1) == board.getCellType(4) && board.getCellType(4) == board.getCellType(7)
				&& board.getCellType(7) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}
		if (board.getCellType(2) == board.getCellType(5) && board.getCellType(5) == board.getCellType(8)
				&& board.getCellType(8) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}

	}

	private void diagonalWinCheck() {

		if (board.getCellType(0) == board.getCellType(4) && board.getCellType(4) == board.getCellType(8)
				&& board.getCellType(8) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}
		if (board.getCellType(2) == board.getCellType(4) && board.getCellType(4) == board.getCellType(6)
				&& board.getCellType(6) != MarkType.EMPTY) {
			result = ResultType.WIN;
			return;
		}

	}

	public ResultType analyzeResult() {
		verticalWinCheck();
		horizontalWinCheck();
		diagonalWinCheck();
		if (board.isBoardFull() && result == ResultType.PROGRESS)
			return (result = ResultType.DRAW);
		return result;
	}

	public ResultType getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}

}
