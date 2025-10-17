package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Playwright_jdbc_mysql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//1.create connection
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","!QAZxsw2");
	
		//2.Create a statement/Query
		Statement statement =connection.createStatement();
		
		//write query you want execute
		String useDatabaseQuery="USE students";
		String selectDatabaseQuery="SELECT * FROM students";
		
		
		//3.Execute query
		statement.execute(useDatabaseQuery);
		
		//4.Result set
		ResultSet set =statement.executeQuery(selectDatabaseQuery);
		
		// Step 5: Get column info (metadata)
        ResultSetMetaData rsmd = set.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Step 6: Print column headers
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println("\n----------------------------------------");

        // Step 7: Loop through results
        while (set.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(set.getString(i) + "\t");
            }
            System.out.println();
        }
		
		//8.close connection
		connection.close();
		System.out.println("Query executed....");
	}

}
