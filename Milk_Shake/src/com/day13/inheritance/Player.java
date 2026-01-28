package com.day13.inheritance;

class Data {
	String name;
	int age;
	String MOM;
	int bestScore;
	String country;
	String team;
	
}

class Football extends Data{
	int goals;
	int assist;
	int High_Score;

	public Football(String name, int age, String MOM, int bestScore, String country,String team, int goals,int assist, int High_Score ) {
		this.name=name;
		this.age=age;
		this.MOM=MOM;
		this.bestScore=bestScore;
		this.country=country;
		this.team=team;
		this.goals=goals;
		this.assist=assist;
		this.High_Score=High_Score;
		
	}
	public int getGoals() {
		return goals;
	}

	public int getAssist() {
		return assist;
	}

	public int getHigh_Score() {
		return High_Score;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMOM() {
		return MOM;
	}
	public int getBestScore() {
		return bestScore;
	}
	public String getCountry() {
		return country;
	}
	public String getTeam() {
		return team;
	}
	
	
	
}
class Cricket extends Data{
	int centuries;
	int half_Centuries;
	
}


public class Player{

	public static void main(String[] args) {
		Football f=new Football("Sunil", 30, "3 times", 35, "India", "India", 3, 4, 67);
		
		System.out.println("Name: "+f.getName());
		System.out.println("Goals: "+f.getGoals());
		System.out.println("Assist: "+f.getAssist());
		System.out.println("High Score: "+f.getHigh_Score());
		System.out.println("Age: "+f.getAge());
		System.out.println("MOM: "+f.getMOM());
		System.out.println("Best Score: "+f.getBestScore());
		System.out.println("Country: "+f.getCountry());
		System.out.println("Team: "+f.getTeam());
	}
}

