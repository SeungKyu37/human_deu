package prjPr;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.StringProperty;

public class Team {
	  private StringProperty teamName;
	  private StringProperty regionName;
	  
	  
	  public Team(StringProperty teamName, StringProperty regionName) {
	    this.teamName = teamName;
	    this.regionName = regionName;
	    PlayerController player = new PlayerController(teamName);
	    }
	  

	public String getTeamName() {
		  return teamName.get();
	  }

	public void setTeamName(StringProperty teamName) {
		this.teamName = teamName;
	}

	public StringProperty teamNameProperty() {
	    return teamName;
	  }
	  public StringProperty regionNameProperty() {
	    return regionName;
	  }
	  
	  
	}
