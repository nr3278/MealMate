package a_accounts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;


@WebServlet(urlPatterns={"/admin/create_accounts_1"})
public class accounts_create extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	req.getRequestDispatcher("a_accounts_create.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		idを取得
		String ac_id = req.getParameter("id");

//		パスワードを取得
		String ac_pass = req.getParameter("pass");

//		パスワード2を取得
		String ac_pass2 = req.getParameter("pass2");


		// パスワードを取得してハッシュ化

		String hash_pass = BCrypt.hashpw(ac_pass, BCrypt.gensalt());


		boolean isPasswordCorrect = BCrypt.checkpw(ac_pass2, hash_pass);

		System.out.println("ID");
		System.out.println(ac_id);
		System.out.println("パスワード");
		System.out.println(ac_pass);
		System.out.println("ハッシュ後");
		System.out.println(hash_pass);

		System.out.println("パス識別");
		System.out.println(isPasswordCorrect);



		req.getRequestDispatcher("a_top.jsp").forward(req, resp);


    }

}
