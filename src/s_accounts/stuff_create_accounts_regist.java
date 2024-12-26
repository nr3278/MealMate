package s_accounts;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.GroupAccounts;
import dao.GroupAccountsDAO;

@WebServlet(urlPatterns={"/stuff/create_stuff_1"})
public class stuff_create_accounts_regist extends HttpServlet {
	@Override

//	入力画面表示
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp
		) throws ServletException, IOException {




		req.getRequestDispatcher("create_stuff_1.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(
	        HttpServletRequest req,
	        HttpServletResponse resp
	    ) throws ServletException, IOException {


//		名前を取得
		String s_name = req.getParameter("s_name");

//		メールアドレスを取得
		String s_mail = req.getParameter("mail");

//		店長権限を取得
		String s_perm = req.getParameter("manager_permission");


//		グループIDを取得
//		HttpSession session = req.getSession();
//		String g_name = (String) session.getAttribute("g_name");



		System.out.println("入力データ");
		System.out.println(s_name);
		System.out.println(s_mail);
		System.out.println(s_perm);

		GroupAccountsDAO dao = new GroupAccountsDAO();



		try {

			boolean mail_dup = dao.searchByEmail(s_mail);
			System.out.println("メールアドレス重複チェックの結果");
			System.out.println(mail_dup);


//			重複していた場合→ページのリロード
			if(mail_dup==true){

				System.out.println("メールアドレスが重複していた");
				req.getRequestDispatcher("create_stuff_1.jsp")
				.forward(req, resp);

			} else {


//				登録
			//  重複チェック用 true=重複
			    Boolean id_dup = true;

			//  スタッフID用
			    String a_id = "";

//			    ID生成→重複チェック
			    while(id_dup == true){
			        Random random = new Random();
			        int min = 0;
			        int max = 9;

//			 		minからmaxまでの範囲の乱数を生成
//			      先頭1文字目
			        int id_1 = random.nextInt((max - min) + 1) + min;

//			      2文字目
			        int id_2 = random.nextInt((max - min) + 1) + min;

//			      3文字目
			        int id_3 = random.nextInt((max - min) + 1) + min;

//				      4文字目
				    int id_4 = random.nextInt((max - min) + 1) + min;

//					5文字目
				    int id_5 = random.nextInt((max - min) + 1) + min;

//					6文字目
				    int id_6 = random.nextInt((max - min) + 1) + min;

//					intからStringへ
			        String s_id_1 = Integer.toString(id_1);
			        String s_id_2 = Integer.toString(id_2);
			        String s_id_3 = Integer.toString(id_3);
			        String s_id_4 = Integer.toString(id_4);
			        String s_id_5 = Integer.toString(id_5);
			        String s_id_6 = Integer.toString(id_6);

			        a_id = s_id_1 + s_id_2 + s_id_3 + s_id_4 + s_id_5 + s_id_6;
//			        a_id = "000001";

			        System.out.println("ID生成");
			        System.out.println(a_id);


			        try{


	//			        IDの重複チェック データが入る
				        GroupAccounts id_dao_dup = dao.searchById(a_id);

				        System.out.println("ID重複チェックの結果");
				        System.out.println(id_dao_dup);

				        if(id_dao_dup==null){
				        	id_dup = false;
				        }


			        } catch (Exception e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
						System.out.println("idの重複チェックDAOエラー");
					}



			    }


//			    登録



			}



		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("メールアドレスの重複チェックDAOエラー");
		}


		req.getRequestDispatcher("a_top.jsp").forward(req, resp);



//		 // 次の登録完了サーブレットにリダイレクト
//	    resp.sendRedirect(req.getContextPath() + "/admin/a_create_group_1/regist/comp");
	}



}
