package com.tss.chess;

public class Horse extends Piece {
	// Finds possible positions vertically
	public void findVerticalPositions(char posX,int posY)
	{
		if(posY-2>=1&&(char)(posX+1)<='H')
		{
			System.out.print((char)(posX+1));
			System.out.print((posY-2)+" ");
		}
		if(posY-2>=1&&(char)(posX-1)>='A')
		{
			System.out.print((char)(posX-1));
			System.out.print((posY-2)+" ");
		}
		if(posY+2<=8&&(char)(posX+1)<='H')
		{
				System.out.print((char)(posX+1));
				System.out.print((posY+2)+" ");
		}
		if(posY+2<=8&&(char)(posX-1)>='A')
		{
				System.out.print((char)(posX-1));
				System.out.print((posY+2)+" ");
		}
	}
	// Finds possible positions horizontally
	public void findHorizontalPositions(char posX,int posY)
	{
		if((char)(posX-2)>='A'&&(posY+1)<=8)
		{
			System.out.print((char)(posX-2));
			System.out.print((posY+1)+" ");
		}
		if((char)(posX-2)>='A'&&(posY-1)>=1)
		{
			System.out.print((char)(posX-2));
			System.out.print((posY-1)+" ");
		}
		if((char)(posX+2)<='H'&&(posY+1)<=8)
		{
			System.out.print((char)(posX+2));
			System.out.print((posY+1)+" ");
		}
		if((char)(posX+2)<='H'&&(posY-1)>=1)
		{
			System.out.print((char)(posX+2));
			System.out.print((posY-1));
		}
	}
	// Displays the possible positions by calling the appropriate functions
	public void displayPositions(Horse horse)
	{
		findVerticalPositions(horse.getPosX(), horse.getPosY());
		findHorizontalPositions(horse.getPosX(), horse.getPosY());
	}
}
