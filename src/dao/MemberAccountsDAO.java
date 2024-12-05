package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberAccountsDAO extends DAO {
    /**
     * @param email
     * @return true: 存在する<br> false: 存在しない
     * @throws Exception
     */
    public boolean searchByEmail(String email) throws Exception {
        Connection connection = getConnection();
        boolean isExist = true;

        PreparedStatement pStatement = connection.prepareStatement("select * from member_accounts where email = ?");

        pStatement.setString(1, email);

        ResultSet rSet = pStatement.executeQuery();

        if (!rSet.next()) {
            isExist = false;
        }

        pStatement.close();
        connection.close();

        return isExist;
    }
}
