package com.example.primerservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CompraDiscos", value = "/compra-discos")
public class CompraDiscos extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Compra de Discos</h1>");
        out.println("<form method = 'post' action='ComprarDiscos'>");
        out.println("Que disco quieres comprar: <input name='Disco'>");
        out.println("<input type ='submit' value='SEARCH'>");
        out.println("<br/>");
        out.println("<a href='index.jsp'>Volver a inicio</href>");
        out.println("</body></html>");

    }
}