//package comz.visitordatamanagement.service;
//
//import comz.visitordatamanagement.dto.Visitor;
//import comz.visitordatamanagement.util.AES;
//import comz.visitordatamanagement.util.AppConstatnts;
//
//public class VisitorService implements VisitorService {
//	VisitorDAO dao=null;
//	
//	public VisitorServiceImp() {
//		dao=new VisitorDAOImp();
//		
//		@Override
//		public String saveVisitor(Visitor visitor) {
//			String encContact=AES.encrypt(visitor.getContact(), AppConstatnts.SECRET_KEY);
//			String encEmail=AES.encrypt(visitor.getEmail(), AppConstatnts.SECRET_KEY);
//			String encAddress=AES.encrypt(visitor.getAddress(), AppConstatnts.SECRET_KEY);
//			
//			visitor.setEmail(encEmail);
//			visitor.setContact(encContact);
//			visitor.setAddress(encAddress); 
//			return dao.saveVisitor(visitor);
//		}
//		@Override
//		
//	}
//
//}
