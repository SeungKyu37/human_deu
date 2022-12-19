package prj;

import javafx.beans.property.StringProperty;

public class Player extends Team{
	public Player(StringProperty team, StringProperty region) {
		super(team, region);
	}
	
	public int number;
	public String name;
	public int age;

}
