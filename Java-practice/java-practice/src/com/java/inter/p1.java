package com.java.inter;
 interface Sports {
	   public void setHomeTeam(String name);
	   public void setVisitingTeam(String name);
	}

	// Filename: Football.java
	 interface Football extends Sports {
	   public void homeTeamScored(int points);
	   public void visitingTeamScored(int points);
	   public void endOfQuarter(int quarter);
	}
class uday implements Football{

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public void homeTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println(points);
	}

	@Override
	public void visitingTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println(points);

	}

	@Override
	public void endOfQuarter(int quarter) {
		// TODO Auto-generated method stub
		System.out.println(quarter);

	}
	
}
public class p1 {
	public static void main(String[] args) {
		uday ob=new uday();
		ob.setHomeTeam("barcelona");
		ob.setVisitingTeam("Manchester United");
		ob.homeTeamScored(3);
		ob.visitingTeamScored(5);
		ob.endOfQuarter(2-5);
	}

}
