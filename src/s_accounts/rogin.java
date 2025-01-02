package s_accounts;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import bean.GroupAccounts;
import dao.GroupAccountsDAO;

@WebServlet(urlPatterns={"/stuff/rogin"})
public class rogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    	req.getRequestDispatcher("/stuff/s_rogin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		メールアドレスを取得
		String ac_mail = req.getParameter("mail");

//		パスワードを取得
		String ac_pass = req.getParameter("pass");

		System.out.println(ac_pass);

//		DAOGroup
		GroupAccountsDAO dao = new GroupAccountsDAO();
		try {
			List<GroupAccounts> accounts_list_dao = dao.list_seachByEmail(ac_mail);
			System.out.println("DAOの結果");
			System.out.println(accounts_list_dao);



//			メールアドレスがない（間違っている）
			if(accounts_list_dao==null){

				System.out.println("ログイン失敗");
//				ログインページへ
				req.getRequestDispatcher("/stuff/s_rogin.jsp").forward(req, resp);
			}



//			DAOから取り出す
//			パスワード
			String dao_pass = "";
//			グループID
			String dao_g_id = "";
//			名前
			String dao_name = "";

			// パスワードを取り出す
		    for (GroupAccounts account : accounts_list_dao) {
		    	dao_pass = account.getPassword();
		        System.out.println("Password: " + dao_pass);

		    	dao_g_id = account.getGroupCode();
		        System.out.println("GroupID: " + dao_g_id);

		    	dao_name = account.getName();
		        System.out.println("Name: " + dao_name);
		    }


//		    パスワード判別
		    boolean isPasswordCorrect = BCrypt.checkpw(ac_pass, dao_pass);

//			パスワードが間違っている
		    if(isPasswordCorrect==false){


		    	System.out.println("ログイン失敗");
//				ログインページへ
				req.getRequestDispatcher("/stuff/s_rogin.jsp").forward(req, resp);

		    }else{




//    		ログイン成功→セッションへ
		    HttpSession session = req.getSession();
//		    名前
    		session.setAttribute("s_name", dao_name);

//		    グループID
    		session.setAttribute("s_g_id", dao_g_id);


//    		セッション確認
    		Object se_name = session.getAttribute("s_name");
    		String st_name = se_name.toString();
    		System.out.println(st_name);
    		Object se_g_id = session.getAttribute("s_g_id");
    		String st_g_id = se_g_id.toString();
    		System.out.println(st_g_id);


    		req.getRequestDispatcher("a_top.jsp").forward(req, resp);


		    }



		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("DAOでエラーが発生している");
		}


//		パスワード判別
//		boolean isPasswordCorrect = BCrypt.checkpw(ac_pass2, hash_pass);


		req.getRequestDispatcher("a_top.jsp").forward(req, resp);


    }

}
