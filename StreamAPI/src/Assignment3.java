//Question:
//
//define a class Player
// 	with
//		int playerid
//		String name
//		int runs
//		String countryname
//
//		define
//			parameterized constructor and getter methods
//
//create 10 players and store them inside a list.
//
//using java8 stream api:
//
//1) display all the players representing "India".
//
//	hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.
//
//
//2) find out how many players have scored more than 5000 runs.
//
//	hint:- use "filter" to check players scored more than 5000 runs and "count" method to count them.
//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player
{
	int playerid;
	String name;
	int runs;
	String countryname;
	Player(int playerid,String name,int runs,String countryname)
	{
		this.name=name;
		this.playerid=playerid;
		this.runs=runs;
		this.countryname=countryname;
	}
	public int getPlayerid() {
		return playerid;
	}
	public String getName() {
		return name;
	}
	public int getRuns() {
		return runs;
	}
	public String getCountryname() {
		return countryname;
	}	
}

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,runs;
		String name,cn;
		List<Player> playerList = new ArrayList<>();
		for(int i=0;i<1;i++)
		{
			
//			Handling input mismatch exception
//			The only way to handle this exception is to make sure that you enter proper values while passing inputs. 
//			It is suggested to specify required values with complete details while reading data from user using scanner class.
			System.out.println("Enter player"+(i+1)+" id :");
			id=sc.nextInt();
			System.out.println("Enter player"+(i+1)+" name :");
			name=sc.next();
			System.out.println("Enter player"+(i+1)+" runs :");
			runs=sc.nextInt();
			System.out.println("Enter player"+(i+1)+" countryname :");
			cn=sc.next();
			playerList.add(new Player(id,name,runs,cn));
		}

		playerList.stream().filter((s)->s.getCountryname().equalsIgnoreCase("india")).forEach((s)->System.out.println("Players from India :  "+s.getName()));
		System.out.println("players who have scored more than 5000 runs :  "+playerList.stream().filter((s)->s.getRuns()>5000).count());		
	}
	
}

