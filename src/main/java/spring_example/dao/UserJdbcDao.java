package spring_example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import spring_example.model.User;

@Component
public class UserJdbcDao {
	
	
	Connection conn = null;
	Statement stsm = null;
	private List<User> listUser;
	
	public UserJdbcDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmctest?autoReconnect=true&useSSL=false",
					"root", "hoang123");

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

	
	// add with user obj
	public boolean insertUser(User user) {
		stsm = null;
		String sql = "INSERT INTO `user` ( `firstname`, `lastname`, `address`) "
				+ "VALUES ('" + user.getFirtsName() + "', '" + user.getLastName() + "', '" 
						+user.getAddress() + "');\n" + 
				"";// need a space
		System.out.println("The SQL query is: " + sql);
		
		try {
			stsm = conn.createStatement();
			if ( stsm.executeUpdate(sql) < 0) return false;
			else return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// add with user obj
	public boolean updateUser(User user) {
		stsm = null;
		String sql = "UPDATE user set firstname = '" + user.getFirtsName() +  
					"',lastname = '" + user.getLastName() + "',address = '"
					+ user.getAddress() + "' WHERE id =" + user.getId();
		System.out.println("The SQL query is: " + sql);
			
		try {
			stsm = conn.createStatement();
			if ( stsm.executeUpdate(sql) < 0) return false;
				else return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	//show list user
	public List<User> getAllUser() {
		listUser = new ArrayList<User>();
		stsm = null;
		String sql = "SELECT * FROM user;" ;
		System.out.println("The SQL query is: " + sql);
		try {
			stsm = conn.createStatement();
			ResultSet result = stsm.executeQuery(sql);
			while(result.next()) {
				User user = new User(Integer.parseInt(result.getString(1)),
						result.getString(2),result.getString(3),
						result.getString(5),result.getString(6));
				listUser.add(user);
			}
//			System.out.println(listUser.size());
			return listUser;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//show list user
		public User findUserByID(int id) {
			stsm = null;
			String sql = "SELECT * FROM user WHERE id =" + id;
			System.out.println("The SQL query is: " + sql);
			try {
				stsm = conn.createStatement();
				ResultSet result = stsm.executeQuery(sql);
				while(result.next()) {
					User user = new User(Integer.parseInt(result.getString(1)),
							result.getString(2),result.getString(3),
							result.getString(5),result.getString(6));
					return user;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

	
	//delete user with id
		public boolean delettUserByID(int id) {
			stsm = null;
			String sql = "DELETE FROM user WHERE id = " + id;
			System.out.println("The SQL query is: " + sql);
			
			try {
				stsm = conn.createStatement();
				System.out.println(123);
				if ( stsm.executeUpdate(sql) < 0) return false;
				else return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
		
		

}
