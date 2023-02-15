package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Pdao;
import dto.Pdto;
@WebServlet("/xyz")
public class Pctrl extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doPost(req, resp);
	String s1=req.getParameter("id");
	int id=Integer.parseInt(s1);
	String s2=req.getParameter("name");
	String s3=req.getParameter("bloodgroup");
	String s4=req.getParameter("number");
	long number=Long.parseLong(s4);
	
	Pdto p1=new Pdto();
	p1.setId(id);
	p1.setName(s2);
	p1.setBloodgroup(s3);
	p1.setNumber(number);
	
	Pdao o1=new Pdao();
	o1.insert(p1);
}
}
