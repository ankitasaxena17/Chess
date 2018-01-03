package com.tss.chess;

public class Rook extends Piece {
	// Finds possible positions vertically
	public void findVerticalPositions(char posX,int posY)
	{
		if(posY>1)
		{
			for(int i=1;i<posY;i++)
			{
				System.out.print(posX);
				System.out.print(i+" ");
			}
		}
		if(posY<8)
		{
			for(int i=8;i>posY;i--)
			{
				System.out.print(posX);
				System.out.print(i+" ");
			}
		}
	}
	// Finds possible positions horizontally
	public void findHorizontalPositions(char posX,int posY)
	{
		char i;
		if(posX>'A')
		{
			for(i='A';i<posX;i++)
			{
				System.out.print(i);
				System.out.print(posY+" ");
			}
		}
		if(posX<'H')
		{
			for(i=(char)(posX+1);i<='H';i++)
			{
				System.out.print(i);
				System.out.print(posY+" ");
			}
		}
	}
	// Displays the possible positions by calling the appropriate functions
	public void displayPositions(Rook rook)
	{
		findVerticalPositions(rook.getPosX(), rook.getPosY());
		findHorizontalPositions(rook.getPosX(), rook.getPosY());
	}
}
