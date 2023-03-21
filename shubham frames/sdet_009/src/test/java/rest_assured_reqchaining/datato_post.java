package rest_assured_reqchaining;

public class datato_post {

	String projectName;
	String teamSize;
	String createdBy;
	String createdOn;
	String status;
	
	
	
	public datato_post(String projectName, String teamSize, String createdBy, String createdOn, String status) {
		super();
		this.projectName = projectName;
		this.teamSize = teamSize;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.status = status;
		
		
		
		
		
		
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getTeamSize() {
		return teamSize;
	}



	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}



	public String getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public String getCreatedOn() {
		return createdOn;
	}



	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
