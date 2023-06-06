package studentDataAPI;



//eclipse ee for java and web developers
//eclipse ide for enterprise java and web developers

public class Student {
	private int id;
	private String name;
	private String course;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + "]";
	}
	
	
	
	
	

}
