import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBupdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC driver is not found !!!");
			e.printStackTrace();
		}
		Connection connection = null;
		PreparedStatement ps = null;
		String conString = "jdbc:mysql://localhost:3306/dell", userName = "root", password = "root";
		try {
			connection = DriverManager.getConnection(conString, userName, password);
			System.out.println("Success");

			String sql = "INSERT INTO accounts values ('pavi','1010')";
			String sql1 = "update accounts set password = 0102 where username = 'csd' ";
			ps = connection.prepareStatement(sql);
			ps = connection.prepareStatement(sql1);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
