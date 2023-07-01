package JUnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.runner.Result;

public class JDBC2 {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kholapurdb", "root", "Ragul@123");
		java.sql.Statement stmt = conObj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultFromDB = stmt.executeQuery("select * from kholapurdb.carowner");
//		resultFromDB.absolute(2);
//		resultFromDB.previous();
		resultFromDB.first();
		resultFromDB.next();
		//resultFromDB.last();
	//System.out.println(resultFromDB.getString(1)+" "+resultFromDB.getString(2));
	System.out.println(resultFromDB.getString("carNum")+" "+resultFromDB.getString("name"));

		conObj.close();
//		
	}
}
