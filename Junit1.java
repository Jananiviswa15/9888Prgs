package JUnit;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Junit1 {
	
	//java with database
	//api --> class and interf, stmt in, resulset int
	//* jdbc - odbc, native aoi, netwrk proto driver, thin driver
	/*
	 * load the libr mysql
	 * register the driver --> driver 
	 * create a connet using username , passwrd and path  --> opn
	 * cudis operation --> craete stmts, (write query)
	 * exe the stmt
	 * result will be obtained 
	 close the con*/
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kholapurdb", "root", "Ragul@123");
		java.sql.Statement stmt = conObj.createStatement();
//		boolean isExecuted = stmt.execute("select * from kholapurdb.addressofowner");
//		System.out.println(isExecuted == true ? "fetched data success" : " failure");
//		
		
		//DML u, i , d  --> execute updateexecuteUpdate
		
//		int noOfRecrdInsertd = stmt.executeUpdate("insert into addressofowner values('2','2','2' )");
//		System.out.println(noOfRecrdInsertd);
		
		int noOfRecrdUpdated = stmt.executeUpdate("update addressofowner set city = 'AGRA'");
		System.out.println(noOfRecrdUpdated);
		
		int noOfRecrdDeleted = stmt.executeUpdate("delete from addressofowner");
		System.out.println(noOfRecrdDeleted);
		
	conObj.close();
	}

}
