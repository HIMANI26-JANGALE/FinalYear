package login.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDaoImpl implements CustomerDao {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertCustomer(Customer c) {
		int status=0;
		try{
			con=ConnectionProvider.getCon();
			ps=con.prepareStatement("insert into customer values(?,?,?,?)");
			ps.setString(1,c.getUsername());
			ps.setString(2,c.getPassword());
			ps.setString(3,c.getFirstName());
			ps.setString(4, c.getLastName());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		Customer c=new Customer();
		try{
			con=ConnectionProvider.getCon();
			ps=con.prepareStatement("select *from customer where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setFirstName(rs.getString(3));
				c.setLastName(rs.getString(4));
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}		
		return c;
	}

}
