package zkj.tyxx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import zkj.tyxx.entity.Student;
import zkj.tyxx.tool.JDBCTool;

public class StudentDao {
	public void save(Student stu){
		Connection con=JDBCTool.getConnection();
		String sql="insert into student"
				+"(stu_name,stu_sex,stu_num,stu_dep,stu_jtime,stu_place,stu_bir,stu_tel) "
				+"values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, stu.getName());
			pst.setString(2, stu.getSex());
			pst.setString(3, stu.getNum());
			pst.setString(4, stu.getDep());
			pst.setString(5, stu.getJtime());
			pst.setString(6, stu.getPlace());
			pst.setString(7, stu.getBir());
			pst.setString(8, stu.getTel());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		JDBCTool.close(con);		
		
	}
	
	public void deleteById(int id){
		Connection con=JDBCTool.getConnection();
		String sql="delete from student where stu_id=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("删除失败");
		}
		JDBCTool.close(con);
		
		
	}
	
	public Collection<Student> findAll(){
		Collection <Student> stuList=new ArrayList<Student>();
		Connection con=JDBCTool.getConnection();
		String sql="select * from student";
		try {
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery(sql);
			while(rst.next()){
				Student stu=new Student();
				stu.setId(rst.getInt("stu_id"));
				stu.setName(rst.getString("stu_name"));
				stu.setSex(rst.getString("stu_sex"));
				stu.setNum(rst.getString("stu_num"));
				stu.setDep(rst.getString("stu_dep"));
				stu.setJtime(rst.getString("stu_jtime"));
				stu.setPlace(rst.getString("stu_place"));
				stu.setBir(rst.getString("stu_bir"));
				stu.setTel(rst.getString("stu_tel"));
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return stuList;
	}
	
	public Student findById(int id){
		Student stu=null;	
		
		Connection con=JDBCTool.getConnection();		
		String sql="select * from student where stu_id=?";
		try {			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);			
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				stu=new Student();
				
				stu.setId(rst.getInt("stu_id"));
				stu.setName(rst.getString("stu_name"));
				stu.setSex(rst.getString("stu_sex"));
				stu.setNum(rst.getString("stu_num"));
				stu.setDep(rst.getString("stu_dep"));
				stu.setJtime(rst.getString("stu_jtime"));
				stu.setPlace(rst.getString("stu_place"));
				stu.setBir(rst.getString("stu_bir"));
				stu.setTel(rst.getString("stu_tel"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return stu;
	}
	
	
	
	public Collection<Student> findByname(String name){
		Collection <Student> stuList=new ArrayList<Student>();	
		
		Connection con=JDBCTool.getConnection();		
		String sql="select * from student where stu_name=?";
		try {			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);			
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Student stu=new Student();
				
				stu.setId(rst.getInt("stu_id"));
				stu.setName(rst.getString("stu_name"));
				stu.setSex(rst.getString("stu_sex"));
				stu.setNum(rst.getString("stu_num"));
				stu.setDep(rst.getString("stu_dep"));
				stu.setJtime(rst.getString("stu_jtime"));
				stu.setPlace(rst.getString("stu_place"));
				stu.setBir(rst.getString("stu_bir"));
				stu.setTel(rst.getString("stu_tel"));
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return stuList;
	}
	
	
	public Collection<Student> findBynum(String num){
        //按学号查询
		Collection <Student> stuList=new ArrayList<Student>();	
		Connection con=JDBCTool.getConnection();		
		String sql="select * from student where stu_num=?";
		try {			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, num);			
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Student stu=new Student();
				stu.setId(rst.getInt("stu_id"));
				stu.setName(rst.getString("stu_name"));
				stu.setSex(rst.getString("stu_sex"));
				stu.setNum(rst.getString("stu_num"));
				stu.setDep(rst.getString("stu_dep"));
				stu.setJtime(rst.getString("stu_jtime"));
				stu.setPlace(rst.getString("stu_place"));
				stu.setBir(rst.getString("stu_bir"));
				stu.setTel(rst.getString("stu_tel"));	
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return stuList;
	}
	
	
	public Collection<Student> findBydep(String dep){
		//按系别查询
		Collection <Student> stuList=new ArrayList<Student>();
		Connection con=JDBCTool.getConnection();		
		String sql="select * from student where stu_dep=?";
		try {			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, dep);			
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				Student stu=new Student();
				
				stu.setId(rst.getInt("stu_id"));
				stu.setName(rst.getString("stu_name"));
				stu.setSex(rst.getString("stu_sex"));
				stu.setNum(rst.getString("stu_num"));
				stu.setDep(rst.getString("stu_dep"));
				stu.setJtime(rst.getString("stu_jtime"));
				stu.setPlace(rst.getString("stu_place"));
				stu.setBir(rst.getString("stu_bir"));
				stu.setTel(rst.getString("stu_tel"));
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		return stuList;
	}
	
	
	
	public void updateByStudent(Student stu){
		Connection con=JDBCTool.getConnection();
		String sql="update student set stu_name=?,stu_sex=?,stu_num=?,"
				+"stu_dep=?,stu_jtime=?,stu_place=? ,stu_bir=?,stu_tel=? where stu_id=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stu.getName());
			pst.setString(2, stu.getSex());
			pst.setString(3, stu.getNum());
			pst.setString(4, stu.getDep());
			pst.setString(5, stu.getJtime());
			pst.setString(6, stu.getPlace());
			pst.setString(7, stu.getBir());
			pst.setString(8, stu.getTel());
			pst.setInt(9, stu.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCTool.close(con);
		
	}
	
	
	
	

}

