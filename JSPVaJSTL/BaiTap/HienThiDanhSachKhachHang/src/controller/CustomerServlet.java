package controller;

import dao.Customerdao;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action  = request.getServletPath();
        if (action == null) {
            action = " ";
        }
        switch(action){
            case "/new":
                break;
            case "/delete":
                deleteCustomer(request,response);
                break;
            case "/edit":
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action  = request.getServletPath();
            if (action == null) {
                action = " ";
            }
            switch(action){
                case "/new":
                    getCreatePage(request,response);
                    break;
                case "/delete":
                    deleteCustomer(request,response);
                    break;
                case "/edit":
                    getEditPage(request,response);
                    break;
                default:
                    listCustomer(request,response);
                    break;
            }
    }

    private void getEditPage(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
    }

    private void getCreatePage (HttpServletRequest request, HttpServletResponse response){

    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = Customerdao.getAllCustomer();
        request.setAttribute("lisCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
        dispatcher.forward(request, response);
    }
}
