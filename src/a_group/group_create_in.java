//	グループ作成入力コントローラ


package a_group;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns={"/admin/a_create_group_1"})
public class group_create_in extends HttpServlet {
	@Override

//	入力画面表示
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp
		) throws ServletException, IOException {




		req.getRequestDispatcher("group_create_1.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(
	        HttpServletRequest req,
	        HttpServletResponse resp
	    ) throws ServletException, IOException {

//		グループ名を取得
		String gru_name = req.getParameter("name");

//		電話番号を取得
		String gru_tel = req.getParameter("tel_num");

//		メールアドレスを取得
		String gru_mail = req.getParameter("mail");



//		セッションへ
		HttpSession session = req.getSession();
		session.setAttribute("g_name", gru_name);
		session.setAttribute("g_tel", gru_tel);
		session.setAttribute("g_mail", gru_mail);


//		確認画面表示用
		req.setAttribute("name",gru_name);
		req.setAttribute("tel",gru_tel);
		req.setAttribute("mail",gru_mail);






	    // POSTリクエストの処理をここに追加
	    req.getRequestDispatcher("group_create_2.jsp")
	    .forward(req, resp);
	}


}
