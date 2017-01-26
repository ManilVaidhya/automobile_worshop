/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.qwrydao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.qwryModel;

/**
 *
 * @author oem
 */
public class JsController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("retrieve", qwrydao.select());
        
        RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("submit")!=null){
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String message = request.getParameter("message");
            
            qwryModel qm = new qwryModel(0,name,phone,message);
            
            qwrydao qd = new qwrydao();
            qd.insert(qm);
        }
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
