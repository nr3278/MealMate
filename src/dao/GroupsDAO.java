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
}
