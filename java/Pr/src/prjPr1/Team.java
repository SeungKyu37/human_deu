package prjPr1;


public class Team {
	private String teamName;
	private String teamRegion;
	
	public Team() {
		this.teamName = "";
		this.teamRegion = "";
	}

	public Team(String teamName, String teamRegion) {
		super();
		this.teamName = teamName;
		this.teamRegion = teamRegion;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamRegion() {
		return teamRegion;
	}

	public void setTeamRegion(String teamRegion) {
		this.teamRegion = teamRegion;
	}

}
