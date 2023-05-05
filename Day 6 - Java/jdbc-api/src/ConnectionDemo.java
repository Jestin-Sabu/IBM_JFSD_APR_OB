import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Connected successfully");
			DatabaseMetaData meta = (DatabaseMetaData) conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB Version: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Version: " + meta.getDriverVersion());
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
	}
}
