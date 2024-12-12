package model.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionManager {
	// URL（jdbcプロトコル:mysqlドライバ:データベースサーバーのホスト名:接続先のデータベース）
	private final static String URL = "jdbc:mysql://localhost:3306/blueteam_db";
	//MySQLデータベースに接続するユーザー名
	private final static String USER = "user_name";
	//MySQLデータベース接続時のパスワード
	private final static String PW = "password";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER, PW);
	}
 
}