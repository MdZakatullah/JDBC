package comz.visitordatamanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import comz.visitordatamanagement.dto.Visitor;
import comz.visitordatamanagement.util.ConnectionUtil;

public class VisitorDAOimp implements VisitorDAO{
	private static Connection connection=ConnectionUtil.connectionGiver();

	@Override
	public String saveVisitor(Visitor visitor) {
		Connection connection=ConnectionUtil.connectionGiver();
		if(connection!=null) {
			String query="INSERT INTO visitor (`name`,`contact`,`email`,`degree`,`stream`,`throughOutPercentage`,`yearOfPassout`,`gender`,`course`,`address`"
					+"VALUES(?,?,?,?,?,?,?,?,?,?)";
			
			try {
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setString(1, visitor.getName());
				ps.setString(2, visitor.getContact());
				ps.setString(3, visitor.getEmail());
				ps.setString(4, visitor.getDegree());
				ps.setString(5, visitor.getStream());
				ps.setString(6, visitor.getThroughOutPercentage());
				ps.setInt(7, visitor.getYearOfPassout());
				ps.setString(8, visitor.getCourse());
				ps.setString(9, visitor.getGender());
				ps.setString(10, visitor.getAddress());
				
				int res=ps.executeUpdate();
				return "no of rows added = "+res;
			}catch (SQLException e) {
				
			}
			return "connected sucessfully";
		}
		
		return "something went wrong";
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		
		return null;
	}

	

}
