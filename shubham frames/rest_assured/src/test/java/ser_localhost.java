import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;



//@JsonPropertyOrder(
//value={
//		"ProjectId",
//		"ProjectName",
//		"NoOfEmp",
//		"ProjectManager",
//		"Status",
//		"CreatedOn"
//		})
public class ser_localhost implements Serializable {


		public String ProjectId ;
		public String ProjectName;
		public int NoOfEmp;
		public String ProjectManager;
		public String Status;
		public String CreatedOn;
		
		public ser_localhost(String projectId, String projectName, int noOfEmp, String projectManager, String status,
				String createdOn) {
			super();
			this.ProjectId = projectId;
			this.ProjectName = projectName;
			this.NoOfEmp = noOfEmp;
			this.ProjectManager = projectManager;
			this.Status = status;
			this.CreatedOn = createdOn;
		}
		
		ser_localhost(){}
		
		
		public String getProjectId() {
			return ProjectId;
		}
		public void setProjectId(String projectId) {
			ProjectId = projectId;
		}
		public String getProjectName() {
			return ProjectName;
		}
		public void setProjectName(String projectName) {
			ProjectName = projectName;
		}
		public int getNoOfEmp() {
			return NoOfEmp;
		}
		public void setNoOfEmp(int noOfEmp) {
			NoOfEmp = noOfEmp;
		}
		public String getProjectManager() {
			return ProjectManager;
		}
		public void setProjectManager(String projectManager) {
			ProjectManager = projectManager;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public String getCreatedOn() {
			return CreatedOn;
		}
		public void setCreatedOn(String createdOn) {
			CreatedOn = createdOn;
		}	
	}