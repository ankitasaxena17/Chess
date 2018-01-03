package com.tss.chess;

public class Bishop extends Piece {
	// Finds possible positions in the left diagonal
	public void findLeftDiagonalPositions(char posX,int posY)
	{
		int j=posY-1;
		if(posX<'H'&&posY>1)//Lower left diagonal
		{
			for(char i=(char)(posX+1);i<='H'&&j>=1;i++,j--)
			{
				System.out.print(i);
				System.out.print(j+" ");
			}
		}
		j=posY+1;
		if(posX>'A'&&posY<8) //Upper left diagonal
		{
			for(char i=(char)(posX-1);i>='A'&&j<=8;i--,j++)
			{
				System.out.print(i);
				System.out.print(j+" ");
			}	
		}
	}
	// Finds possible positions in the right diagonal
	public void findRightDiagonalPositions(char posX,int posY)
	{
		int j=posY-1;
		char i;
		if(posX>'A'&&posY>1) //Lower Right Diagonal
		{
			for(i=(char)(posX-1);i>='A'&&j>=1;i--,j--)
			{
				System.out.print(i);
				System.out.print(j+" ");
			}	
		}
		j=posY+1;
		if(posX<'H'&&posY<8) //Upper Right Diagonal
		{
			for(i=(char)(posX+1);i<='H'&&j<=8;i++,j++)
			{
				System.out.print(i);
				System.out.print(j+" ");
			}
		}	
	}
	// Displays the possible positions by calling the appropriate functions
	public void displayPositions(Bishop bishop)
	{
		findLeftDiagonalPositions(bishop.getPosX(), bishop.getPosY());
		findRightDiagonalPositions(bishop.getPosX(), bishop.getPosY());
	}
}
