package controller;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://www.tubefilter.com/wp-content/uploads/2019/11/dobrik-people.jpg"));
        list.add(new Customer("Nguyễn Văn Nam","1983-08-21","Băc Giang","https://media.vanityfair.com/photos/5d669dc5b5890000082acd6b/16:9/w_2560%2Cc_limit/Trump32.jpg"));
        list.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://cdn.lifehack.org/wp-content/uploads/2015/02/what-makes-people-happy.jpeg"));
        list.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fspecials-images.forbesimg.com%2Fdam%2Fimageserve%2F1078084172%2F960x0.jpg%3Ffit%3Dscale"));
        list.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://cbsnews1.cbsistatic.com/hub/i/2018/11/06/0c1af1b8-155a-458e-b105-78f1e7344bf4/2018-11-06t054310z-1334124005-rc1be15a8050-rtrmadp-3-people-sexiest-man.jpg"));

        request.setAttribute("customer", list);


        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
    }
}
