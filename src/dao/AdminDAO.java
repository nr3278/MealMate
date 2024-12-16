package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDAO extends DAO {

//	アカウント作成
	 public int insert(String id, String pass) throws Exception {
		 Connection connection = getConnection();
		 PreparedStatement pStatement = connection.prepareStatement("SELECT *  FROM A_ACCOUNTS where ID LIKE ? AND PASSWORD  LIKE ?");

	        pStatement.setString(1, id);
	        pStatement.setString(2, pass);


	        int line = pStatement.executeUpdate();

	        pStatement.close();
	        connection.close();

	        return line;
	 }

}
