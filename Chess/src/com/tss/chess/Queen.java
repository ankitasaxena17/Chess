package com.tss.chess;

public class Queen extends Piece {
	// Displays the possible positions by calling the appropriate functions
	
	public void displayPositions(Queen queen)
	{
		Rook rook=new Rook();
		rook.findVerticalPositions(queen.getPosX(), queen.getPosY());
		rook.findHorizontalPositions(queen.getPosX(), queen.getPosY());
		Bishop bishop=new Bishop();
		bishop.findLeftDiagonalPositions(queen.getPosX(), queen.getPosY());
		bishop.findRightDiagonalPositions(queen.getPosX(), queen.getPosY());
	}
}
