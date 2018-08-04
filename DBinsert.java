import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBinsert {
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

			String sql = "INSERT INTO accounts values ('csd','123')";
			ps = connection.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
