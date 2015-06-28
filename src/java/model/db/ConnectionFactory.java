/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Marcel
 */
public class ConnectionFactory {
    public static Connection getConnection() throws ConnectionExceptions {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/PseudoTwitter", "postgres", "zero");
		} catch (Exception e){
			throw new ConnectionExceptions(e.getMessage());
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws ConnectionExceptions {
		close(conn, stmt, rs);
	}

	public static void closeConnection(Connection conn, Statement stmt) throws ConnectionExceptions {
		close(conn, stmt, null);
	}
	
	public static void closeConnection(Connection conn) throws ConnectionExceptions {
		close(conn, null, null);
	}
	
	private static void close(Connection conn, Statement stmt, ResultSet rs) throws ConnectionExceptions {
		
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();			
		} catch (Exception e) {
			throw new ConnectionExceptions(e.getMessage());
		}	
	}
}
