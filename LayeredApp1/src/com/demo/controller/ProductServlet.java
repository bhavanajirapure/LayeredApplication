package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dto.ProductDTO;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.vo.ProductVO;



public class ProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = null;
		ProductVO vo = null;
		ProductDTO dto = null;
		ProductService service = null;
		String name = null, pid = null, cost = null, mfgDate = null, msg = null;
		Date mfd = null;
		RequestDispatcher rd = null;
		pw = res.getWriter();
		vo = new ProductVO();
		dto = new ProductDTO();
		service = new ProductServiceImpl();
		res.setContentType("text/html");
		pid=req.getParameter("pid");
		name=req.getParameter("name");
		cost=req.getParameter("cost");
		mfgDate=req.getParameter("mfgDate");
		// set values to vo class obj
		vo.setpId(pid);
		vo.setpName(name);
		vo.setpCost(cost);
		vo.setMfgDate(mfgDate);
		// convert vo to dto
		dto.setpId(Integer.parseInt(vo.getpId()));
		dto.setpName(vo.getpName());
		dto.setpCost(Double.parseDouble(vo.getpCost()));
		try {
			mfd = new SimpleDateFormat("dd/MM/yyyy").parse(vo.getMfgDate());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dto.setMfgDate(mfd);
		// use service class method
		msg = service.saveProduct(dto);
		pw.println("<h1 style=text-align:'center'>"+msg+"</h1>");
		/*
		 * req.setAttribute("recordAdded", msg); // create dispatcher obj rd =
		 * req.getRequestDispatcher("AddProd.html"); rd.forward(req, res);
		 */
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
