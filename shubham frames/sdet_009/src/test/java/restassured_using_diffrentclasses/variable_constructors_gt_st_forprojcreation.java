package restassured_using_diffrentclasses;

public class variable_constructors_gt_st_forprojcreation {

	String createdBy ;
	String projectName ;
	String projectId ;
	String createdOn ;
	String status ;


	/**
	 * 
	 * @param createdBy = name who created project
	 * @param projectName = name of project
	 * @param projectId = id for project
	 * @param createdOn = date of creation
	 * @param status = status of project
	 */
	public variable_constructors_gt_st_forprojcreation(String createdBy, String projectName, String projectId,
			String createdOn, String status) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.projectId = projectId;
		this.createdOn = createdOn;
		this.status = status;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getProjectId() {
		return projectId;
	}


	public void setProjectId(String projectId) {
		this.projectId = projectId;
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
