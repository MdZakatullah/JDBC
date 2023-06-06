package comz.visitordatamanagement.dao;

import comz.visitordatamanagement.dto.Admin;

public interface AdminDAO {
	
	public String saveAdmin(Admin admin);
	
	public Admin adminLogin(String userName, String password);

}
