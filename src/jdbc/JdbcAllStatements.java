package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAllStatements {

	private static Connection con = null;

	private static Statement st = null;

	private static PreparedStatement ps = null;
	
	private static PreparedStatement ps1 = null;

	private static ResultSet result = null;
	
	private static final String URL="jdbc:mysql://127.0.0.1:3306/sakila";
	
	private static final String USER="root";
	
	private static final String PASS="Mayank283";
	
	public static void main(String[] args) {

		String SqlSelect = "Select * from sakila.salesman";

		String delete_sql = " delete from sakila.salesman where salesman_id=5011";

		String prepare_input_sql = " insert into sakila.salesman values(?,?,?,?)";
		
		String prepare_select_sql="select * from sakila.salesman where salesman_id = ?";

		try {
			con = DriverManager.getConnection(URL, USER,PASS);
			//con.setAutoCommit(false);

			//Statements Based Queries
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			System.out.println("Rows affected" + st.executeUpdate(delete_sql));
			result = st.executeQuery(SqlSelect);

			while (result.next()) {
				System.out.println(result.getInt("salesman_id") + " " + result.getString("name"));
			}
			
			//Prepared Statement
			ps = con.prepareStatement(prepare_input_sql, ResultSet.FETCH_FORWARD, ResultSet.CONCUR_READ_ONLY);
			ps.setInt(1, 5011);
			ps.setString(2, "Mr Eagle");
			ps.setString(3, "Tempe");
			ps.setDouble(4, 0.23);
			System.out.println("Rows Impacted by prepare insert " + ps.executeUpdate());
			
			ps1=con.prepareStatement(prepare_select_sql);
			ps1.setInt(1,5009);
			result = ps1.executeQuery();
			//con.commit();
			

			while (result.next()) {
				System.out.println(result.getInt("salesman_id") + " " + result.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			try {
				result.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}