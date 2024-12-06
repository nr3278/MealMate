package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Languages;

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

    public Languages searchLanguageByMemberId(String mId) throws Exception {
        Connection connection = getConnection();
        PreparedStatement pStatement = connection.prepareStatement("select l.id as id, l.name as lang_name, l.code as lang_code from member_accounts m join languages l on m.language_id = l.id where m.id = '?';");
        Languages language = null;

        pStatement.setString(1, mId);

        ResultSet rSet = pStatement.executeQuery();

        if (rSet.next()) {
            language = new Languages();

            language.setId(rSet.getInt("id"));
            language.setName(rSet.getString("lang_name"));
            language.setCode(rSet.getString("lang_code"));
        }

        pStatement.close();
        connection.close();

        return language;
    }
}

































