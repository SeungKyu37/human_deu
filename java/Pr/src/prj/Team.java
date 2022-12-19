package prj;

import javafx.beans.property.StringProperty;

public class Team {
	public StringProperty team;
	public StringProperty region;
	
	public Team(StringProperty team, StringProperty region) {
		this.team = team;
		this.region = region;
	}

}
