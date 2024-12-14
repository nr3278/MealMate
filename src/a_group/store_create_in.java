package a_group;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Groups;
import dao.GroupsDAO;

@WebServlet(urlPatterns={"/admin/a_create_store_1"})
public class store_create_in extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GroupsDAO dao = new GroupsDAO();
        List<Groups> groupsList = null;
        try {


//        	グループID、グループ名取得する
            groupsList = dao.id_name();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(groupsList);

        req.setAttribute("groupsList", groupsList);
        req.getRequestDispatcher("store_create_1.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POSTリクエストの処理

//		グループ名を取得
		String sto_name = req.getParameter("name");

//		電話番号を取得
		String sto_tel = req.getParameter("tel_num");

//		メールアドレスを取得
		String sto_mail = req.getParameter("mail");

//		住所
		String sto_address = req.getParameter("address");

//		グループIDとグループ名
		String gru_id_name = req.getParameter("groups_list");
		String[] gru_id_name_List =  gru_id_name.split(",");

		String gru_id = gru_id_name_List[0];
		String gru_name = gru_id_name_List[1];

		System.out.println(sto_name);
		System.out.println(sto_tel);
		System.out.println(sto_mail);
		System.out.println(sto_address);
		System.out.println(gru_id_name);

		System.out.println(gru_id);
		System.out.println(gru_name);

//		for(String s:gru_id_name_List){
//			System.out.println(s);
//		}

//		System.out.println(gru_id_name_List);


		req.getRequestDispatcher("store_create_1.jsp").forward(req, resp);



    }

}