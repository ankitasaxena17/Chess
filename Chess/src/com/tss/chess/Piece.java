package com.tss.chess;
//Abstract Class
public abstract class Piece {
	private String type;
	private char posX;
	private int posY;
	public Piece()
	{
		type="";
		posX=0;
		posY=0;
	}
	//Parameterized Constructor
	public Piece(String type, char posX, int posY) {
		super();
		this.type = type;
		this.posX = posX;
		this.posY = posY;
	}
	public String getType() {
		return type;
	}
	public void findVerticalPositions(char posX,int posY)
	{
		
	}
	public void findHorizontalPositions()
	{
		
	}
	public void findLeftDiagonalPositions()
	{
		
	}
	public void findRightDiagonalPositions()
	{
		
	}
	public void displayPositions()
	{
		
	}
	//Setters and Getters for accessing the private variables
	public void setType(String type) {
		this.type = type;
	}
	public char getPosX() {
		return posX;
	}
	public void setPosX(char posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
