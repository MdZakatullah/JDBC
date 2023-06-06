package comz.visitordatamanagement.service;

import java.util.List;

import comz.visitordatamanagement.dto.Visitor;

public interface VisitorDAO {
	
	
	public String saveVisitor(Visitor visitor);
	public String updateVisitor(Visitor visitor);
	public Visitor deleteVisitorById(int Id);
	public Visitor getVisitorById(int Id);
	public Visitor getVisitorByContact(String contact);
	public Visitor deleteVisitorBYEmail(String email);
	
	public List<Visitor> getAllVisitor();
	public List<Visitor> getVisitorDataSortedByName();
	public List<Visitor> getDegree();
	

}
