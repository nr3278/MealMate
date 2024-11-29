package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Foods_all_name;

public class FoodsDAO extends DAO {
	public List<Foods_all_name> all() throws Exception{
		List<Foods_all_name> list = new ArrayList<Foods_all_name>();

		// データベースに接続
		Connection con = getConnection();

		// 実行したいSQL文をプリペアードステートメントで準備
		PreparedStatement st = con.prepareStatement(
				"SELECT ID,NAME FROM FOODS "
				);

		ResultSet rs = st.executeQuery();

		// 結果から1件ずつ取り出すループ
		while (rs.next()) {
			Foods_all_name f = new Foods_all_name();

//			値のセット
			f.setId(rs.getInt("id"));
			f.setName(rs.getString("name"));

			// リストに追加
			list.add(f);
		}
		// データベースとの接続を解除（必ず書く！！！！！！！！）
		st.close();
		con.close();

		// リストを返却
		return list;

	}




}
