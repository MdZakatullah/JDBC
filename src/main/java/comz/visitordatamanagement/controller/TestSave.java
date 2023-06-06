package comz.visitordatamanagement.controller;

import comz.visitordatamanagement.dao.VisitorDAO;
import comz.visitordatamanagement.dao.VisitorDAOimp;
import comz.visitordatamanagement.dto.Visitor;

public class TestSave {
	public static void main(String[] args) {
		Visitor visitor=new Visitor();
		visitor.setName("Legain");
		visitor.setAddress("Gangtok");
		visitor.setContact("9876509875");
		visitor.setCourse("JAVA");
		visitor.setDegree("B.TECH");
		visitor.setStream("ME");
		visitor.setThroughOutPercentage("58.6");
		visitor.setYearOfPassout(2020);
		visitor.setGender("male");
		visitor.setEmail("lee@gmail.com");
		
		VisitorDAO dao=new VisitorDAOimp();
		System.out.println(dao.saveVisitor(visitor));
	}

}
