package language.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCallableStatement {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/sakila";

	private static final String USER = "root";

	private static final String PASS = "Mayank283";

	private static Connection con = null;

	private static CallableStatement call = null;

	public static void main(String[] args) {

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			call = con.prepareCall("{call sakila.getactordetails(?,?,?)}", ResultSet.FETCH_FORWARD,
					ResultSet.CONCUR_READ_ONLY);
			call.setInt(1, 198);
			call.registerOutParameter(2, java.sql.Types.VARCHAR);
			call.registerOutParameter(3, java.sql.Types.DATE);
			call.execute();

			String name = call.getString(2);
			Date dat = call.getDate(3);
			System.out.println(name + " " + dat);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}