package JUnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC3 {
	//STMTS, prepard stmt, callable 
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String carName = "ford";
		String regNum = "TN37DR0218";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kholapurdb", "root", "Ragul@123");
		//		PreparedStatement stmt = conObj.prepareStatement("insert into carowner values(?,?)");
		//		stmt.setString(1, regNum);
		//		stmt.setString(2, carName);
		//		int noOfRecrdsInserted = stmt.executeUpdate();

		//		PreparedStatement stmt = conObj.prepareStatement("Delete from carowner where carNum = ?");
		//		stmt.setString(1, regNum);
		//		
		//		int noOfRecrdsInserted = stmt.executeUpdate();
		//		System.out.println(noOfRecrdsInserted);
		//		//"insert into carowner(carName) values(?)");

		PreparedStatement preStmt = conObj.prepareStatement("select * from carowner");
		ResultSet allRecords = preStmt.executeQuery();
		while(allRecords.next()) { //move and see if there is rec or not
			System.out.println(allRecords.getString("carNum")+" "+allRecords.getString("name"));
		}
		conObj.close();
	}
}
