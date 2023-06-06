package comz.visitordatamanagement.dto;

public class Visitor {
	private int id;
	private String name;
	private String contact;
	private String email;
	private String degree;
	private String stream;
	private String throughOutPercentage;
	private int yearOfPassout;
	private String gender;
	private String course;
	private String address;
	
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getThroughOutPercentage() {
		return throughOutPercentage;
	}
	public void setThroughOutPercentage(String throughOutPercentage) {
		this.throughOutPercentage = throughOutPercentage;
	}
	public int getYearOfPassout() {
		return yearOfPassout;
	}
	public void setYearOfPassout(int yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", degree="
				+ degree + ", stream=" + stream + ", throughOutPercentage=" + throughOutPercentage + ", yearOfPassout="
				+ yearOfPassout + ", gender=" + gender + ", course=" + course + ", address=" + address + "]";
	}
	

}
