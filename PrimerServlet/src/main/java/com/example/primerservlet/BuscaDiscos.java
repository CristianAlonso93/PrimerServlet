package com.example.primerservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "EncuentraDiscos", value = "/encuentra-discos")
public class BuscaDiscos extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Buscador de discos</h1>");
        out.println("<form method = 'post' action='EncuentraDisco'>");
        out.println("Escriba el nombre del autor: <input name='authorName'>");
        out.println("<input type ='submit' value='SEARCH'>");
        out.println("<br/>");
        out.println("<a href='index.jsp'>Volver a inicio</href>");
        out.println("</body></html>");

    }

}