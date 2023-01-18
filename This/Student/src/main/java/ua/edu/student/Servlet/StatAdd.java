/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ua.edu.student.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.edu.student.CustomExceptions.AverageException;
import ua.edu.student.CustomExceptions.EmailException;
import ua.edu.student.Custom.*;

/**
 *
 * @author Богдан
 */
@WebServlet(name = "StatAdd", urlPatterns = {"/StatAdd"})
public class StatAdd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
HttpSession session = request.getSession();
        List<Student> students = (List<Student>)session.getAttribute("students");
        
        ResultCalculation stat = ResultCalculation.getInstance();
        
            //Додаємо розроблений алгоритм обрахунків до об'єкту stat
        stat.setMinAge(Utils.calculateMinAge((LinkedList<Student>) students));
        stat.setMaxAge(Utils.calculateMaxAge((LinkedList<Student>) students));
        try{
            stat.setAverageAge(Utils.calculateAverageAge((LinkedList<Student>) students));
        } catch (AverageException ex) {
            Logger.getLogger(StatAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stat.setPopularEmail(Utils.calculatePopularEmail((LinkedList<Student>) students));
        } catch (EmailException ex) {
            Logger.getLogger(StatAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        stat.setCountEmailSumdu(Utils.calculateEmailSumdu((LinkedList<Student>) students));
        stat.setCountGroup(Utils.calculateCountGroup((LinkedList<Student>) students));
        
        session.setAttribute("stat", stat);
        response.sendRedirect("resultStudents.jsp");
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
