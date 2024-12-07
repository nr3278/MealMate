package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Groups;

public class GroupsDAO extends DAO {
    public int insert(Groups group) throws Exception {
        Connection connection = getConnection();

        PreparedStatement pStatement = connection.prepareStatement("insert into groups_s values (?, ?, ?, ?)");

        pStatement.setString(1, group.getGroupCode());
        pStatement.setString(2, group.getPhoneNum());
        pStatement.setString(3, group.getEmail());
        pStatement.setString(4, group.getName());

        int line = pStatement.executeUpdate();

        pStatement.close();
        connection.close();

        return line;
    }

    public List<Groups>all() throws Exception {
        List<Groups> groups = new ArrayList<Groups>();

        Connection connection = getConnection();

        PreparedStatement pStatement = connection.prepareStatement("select * from groups_s");

        ResultSet rSet = pStatement.executeQuery();

        while (rSet.next()) {
            Groups group = new Groups();

            group.setGroupCode(rSet.getString("group_code"));
            group.setPhoneNum(rSet.getString("phone_num"));
            group.setEmail(rSet.getString("email"));
            group.setName(rSet.getString("name"));

            groups.add(group);
        }

        pStatement.close();
        connection.close();

        return groups;
    }

    // 別のDAOで使う用
    public Groups search(String id) throws Exception {
        Connection connection = getConnection();

        PreparedStatement pStatement = connection.prepareStatement("select * from groups_s where group_code = ?");

        pStatement.setString(1, id);

        ResultSet rSet = pStatement.executeQuery();

        Groups group = new Groups();

        group.setGroupCode(rSet.getString("group_code"));
        group.setPhoneNum(rSet.getString("phone_num"));
        group.setEmail(rSet.getString("email"));
        group.setName(rSet.getString("name"));

        pStatement.close();
        connection.close();

        return group;
    }


//  グループIDの重複チェック
//	重複していたらFalseを返す
    public boolean duplication(String gru_id) throws Exception {
        Connection connection = getConnection();

        // GROUP_CODEが指定されたgru_idと一致するかを確認するクエリを準備
        PreparedStatement dup = connection.prepareStatement("SELECT GROUP_CODE FROM GROUPS_S WHERE GROUP_CODE = ?");
        dup.setString(1, gru_id);

        // クエリを実行して結果を取得
        ResultSet rs = dup.executeQuery();

        boolean dup_f = false; // デフォルト値をFalseに設定

        // 結果セットをチェック
        if (rs.next()) {
            // 存在する場合、dup_fをTrueに設定
            if (rs.getString("GROUP_CODE") != null) {
                dup_f = false;
            }
        }

        // リソースをクローズ
        rs.close();
        dup.close();
        connection.close();

        // dup_fを返す
        return dup_f;
    }
}
