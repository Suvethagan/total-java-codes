package JDBCSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSingleton {
	private static JDBCSingleton jdbc = null;
	private static Connection connection = null;
	
	private JDBCSingleton() {

	}

	public static JDBCSingleton getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		 //Connection connection = null;
		if (connection == null) {
			Class.forName("com.mysql.jdbc.Driver");
			String conString = "jdbc:mysql://localhost:3306/dell", userName = "root", password = "root";

			connection = DriverManager.getConnection(conString, userName, password);
			System.out.println("Success");

		}
		return connection;
	}

	public void insert() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		connection = getConnection();
		PreparedStatement ps = null;
		String sql = "INSERT INTO accounts values ('Sri','1000')";
		ps = connection.prepareStatement(sql);
		ps.executeUpdate();
	}

	public void view() throws ClassNotFoundException, SQLException {
		// Connection connection = null;
		JDBCSingleton myConnection = JDBCSingleton.getInstance();
		connection = myConnection.getConnection();
		PreparedStatement ps = connection.prepareStatement("Select *from accounts where username = 'Sri'");
		String sql = "create view accountsview as select username from accoutns where password = 1012";
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("Name : " + rs.getString("username") + "\tPassword : " + rs.getString("password"));
		}
	}
	public void userinsert() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		connection = getConnection();
		PreparedStatement ps = null;
		//Scanner sql = new Scanner(System.in);
		String username = " ";
		Scanner sql = new Scanner(System.in);

		String sql1 = "INSERT INTO accounts values ('Sri','1000')";
		ps = connection.prepareStatement(sql1);
		ps.executeUpdate();
		
		
		System.out.println("username : ");
		
	}

}
