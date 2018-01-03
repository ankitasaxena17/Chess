package com.tss.chess;

public class King extends Piece {
	/**
	 * @param args
	 */
	// Finds possible positions vertically
	public void findVerticalPositions(char posX,int posY)
	{
		if(posY>1)
		{
			System.out.print(posX);
			System.out.print(posY-1+" ");
		}
		if(posY<8)
		{
			System.out.print(posX);
			System.out.print(posY+1+" ");
		}
	}
	// Finds possible positions horizontally
	public void findHorizontalPositions(char posX,int posY)
	{
		char temp=(char) (posX-1);
		char temp1=(char) (posX+1);
		if(posX>'A')
		{
			System.out.print(temp);
			System.out.print(posY+" ");
		}
		if(posX<'H')
		{
			System.out.print(temp1);
			System.out.print(posY+" ");
		}
	}
	// Finds possible positions in the left diagonal
	public void findLeftDiagonalPositions(char posX,int posY)
	{
		char temp=(char) (posX-1);
		char temp1=(char) (posX+1);
		if(posX>'A'&&posY>1) //Lower Left Diagonal
		{
			System.out.print(temp);
			System.out.print(posY-1+" ");
		}
		if(posX<'H'&&posY<8) //Lower Left Diagonal
		{
			System.out.print(temp1);
			System.out.print((posY+1)+" ");
		}
	}
	// Finds possible positions in the right diagonal
	public void findRightDiagonalPositions(char posX,int posY)
	{
		char temp=(char) (posX-1);
		char temp1=(char) (posX+1);
		if(posX>'A'&&posY<8) //Lower Right Diagonal
		{
			System.out.print(temp);
			System.out.print(posY+1+" ");
		}
		if(posX<'H'&&posY>1)  //Upper Right Diagonal
		{
			System.out.print(temp1);
			System.out.print(posY-1);
		}
	}
	// Displays the possible positions by calling the appropriate functions
	public void displayPositions(King king)
	{
		findVerticalPositions(king.getPosX(), king.getPosY());
		findHorizontalPositions(king.getPosX(), king.getPosY());
		findLeftDiagonalPositions(king.getPosX(), king.getPosY());
		findRightDiagonalPositions(king.getPosX(), king.getPosY());
	}
}
