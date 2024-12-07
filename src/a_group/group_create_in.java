//	グループ作成入力コントローラ


package a_group;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String gru_mail = req.getParameter("tel_num");








	    // POSTリクエストの処理をここに追加
	    req.getRequestDispatcher("group_create_2.jsp")
	    .forward(req, resp);
	}


}
