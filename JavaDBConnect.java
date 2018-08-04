import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDBConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC driver is not found !!!");
			e.printStackTrace();
		}
		Connection connection = null;
		String conString = "jdbc:mysql://localhost:3306/dell", userName = "root", password = "root";
		try {
			connection = DriverManager.getConnection(conString, userName, password);
			System.out.println("Success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
