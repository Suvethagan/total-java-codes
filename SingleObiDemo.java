package JDBCSingleton;

import java.sql.SQLException;

public class SingleObiDemo {
	private static final JDBCSingleton jdbc = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBCSingleton jdbc = JDBCSingleton.getInstance();
		jdbc.insert();
		//jdbc.view();
		jdbc.userinsert();
	}
}
