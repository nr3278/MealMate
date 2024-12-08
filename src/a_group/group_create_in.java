//	グループ作成入力コントローラ


package a_group;

import java.io.IOException;
import java.util.Random;

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
		String gru_mail = req.getParameter("mail");



//		グループID用ランダム（001～999）
        Random random = new Random();
        int min = 1;
        int max = 9;

// 		minからmaxまでの範囲の乱数を生成
//      先頭1文字目
        int id_1 = random.nextInt((max - min) + 1) + min;

//      2文字目
        int id_2 = random.nextInt((max - min) + 1) + min;

//      3文字目
        int id_3 = random.nextInt((max - min) + 1) + min;

//		intからStringへ
        String s_id_1 = Integer.toString(id_1);
        String s_id_2 = Integer.toString(id_2);
        String s_id_3 = Integer.toString(id_3);

        String s_id = s_id_1 + s_id_2 + s_id_3;


        System.out.println("id：" + s_id);
        System.out.println("name：" + gru_name);
        System.out.println("tel：" + gru_tel);
        System.out.println("mail：" + gru_mail);



	    // POSTリクエストの処理をここに追加
	    req.getRequestDispatcher("group_create_2.jsp")
	    .forward(req, resp);
	}


}
