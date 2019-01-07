package zkj.tyxx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import zkj.tyxx.tool.JDBCTool;

public class AdminDao {
	public boolean TestLogin(String name,String pass){
		boolean f=false;
		Connection con=JDBCTool.getConnection();
		String sql="select  * from Admin where adm_name=? and adm_pass=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, pass);
			ResultSet rst=pst.executeQuery();
			if(rst.next())
				f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return f;
	}
	
}
