package a.b.c.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.model.MemberDTO;

import a.b.c.dao.MemberDAO;

@WebServlet("/AlpaHome")
public class Servlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");

		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.join(dto);
		

	}

}
