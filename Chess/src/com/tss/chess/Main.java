package com.tss.chess;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int y;
		String str="";
		String input=ob.readLine();
		String st[]=input.split(" "); //Splitting the String
		str+=st[1].charAt(1);
		y=Integer.parseInt(str);
		if(st[0].equalsIgnoreCase("king"))
		{
			King king=new King();
			king.setType(st[0]);
			king.setPosX(st[1].charAt(0));
			king.setPosY(y);
			king.displayPositions(king);
		}
		else if(st[0].equalsIgnoreCase("queen"))
		{
			Queen queen=new Queen();
			queen.setType(st[0]);
			queen.setPosX(st[1].charAt(0));
			queen.setPosY(y);
			queen.displayPositions(queen);
		}
		else if(st[0].equalsIgnoreCase("bishop"))
		{
			Bishop bishop=new Bishop();
			bishop.setType(st[0]);
			bishop.setPosX(st[1].charAt(0));
			bishop.setPosY(y);
			bishop.displayPositions(bishop);
		}
		else if(st[0].equalsIgnoreCase("horse"))
		{
			Horse horse=new Horse();
			horse.setType(st[0]);
			horse.setPosX(st[1].charAt(0));
			horse.setPosY(y);
			horse.displayPositions(horse);
		}
		else if(st[0].equalsIgnoreCase("pawn"))
		{
			Pawn pawn=new Pawn();
			pawn.setType(st[0]);
			pawn.setPosX(st[1].charAt(0));
			pawn.setPosY(y);
			pawn.displayPositions(pawn);
		}
		else if(st[0].equalsIgnoreCase("rook"))
		{
			Rook rook=new Rook();
			rook.setType(st[0]);
			rook.setPosX(st[1].charAt(0));
			rook.setPosY(y);
			rook.displayPositions(rook);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
