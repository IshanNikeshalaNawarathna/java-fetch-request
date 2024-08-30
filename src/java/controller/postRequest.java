/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import netscape.javascript.JSObject;

/**
 *
 * @author Ishan
 */
@WebServlet(name = "postRequest", urlPatterns = {"/postRequest"})
public class postRequest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Gson gson = new Gson();
        User user = gson.fromJson(request.getReader(), User.class);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Ishan");
        jsonObject.addProperty("country", "USA");
        
        response.setContentType("application/json");
        response.getWriter().write(gson.toJson(jsonObject));

    }

}
