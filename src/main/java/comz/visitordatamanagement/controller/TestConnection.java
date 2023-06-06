package comz.visitordatamanagement.controller;

import comz.visitordatamanagement.dao.VisitorDAO;
import comz.visitordatamanagement.dao.VisitorDAOimp;
import comz.visitordatamanagement.dto.Visitor;

public class TestConnection {
	public static void main(String[] args) {
		VisitorDAO dao=new VisitorDAOimp();
		
		System.out.println(dao.saveVisitor(new Visitor()));
	}

}
