package com.tss.chess;

public class Pawn extends Piece {

	public Pawn()
	{
		
	}
	// Finds possible positions vertically
	public void findVerticalPositions(char posX,int posY)
	{
		if(posY<8)
		{
			System.out.print(posX);
			System.out.print(posY+1+" ");
		}
	}
	// Finds possible positions in the left diagonal
	public void findLeftDiagonalPositions(char posX,int posY)
	{
		char temp=(char) (posX-1);
		if(posX>'A'&&posY<8)
		{
			System.out.print(temp);
			System.out.print(posY+1+" ");
		}
	}
	// Finds possible positions in the right diagonal
	public void findRightDiagonalPositions(char posX,int posY)
	{
		char temp=(char) (posX+1);
		if(posX<'H'&&posY<8)
		{
			System.out.print(temp);
			System.out.print(posY+1);
		}
	}
	// Displays the possible positions by calling the appropriate functions
	public void displayPositions(Pawn pawn)
	{
		findVerticalPositions(pawn.getPosX(), pawn.getPosY());
		findLeftDiagonalPositions(pawn.getPosX(), pawn.getPosY());
		findRightDiagonalPositions(pawn.getPosX(), pawn.getPosY());
	}
}
