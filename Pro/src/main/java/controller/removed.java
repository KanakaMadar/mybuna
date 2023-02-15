package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Pdao;
import dto.Pdto;

@WebServlet("/yesu")
public class removed extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPut(req, resp);
		String s1 = req.getParameter("id");
		int id = Integer.parseInt(s1);

		Pdao o1 = new Pdao();
		o1.remove(id);
	}
}
