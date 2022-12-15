package com.example.primerservlet;

import java.io.*;

import com.example.primerservlet.Modelo.GestorConsultas;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "EncuentraDisco", value = "/EncuentraDisco")
public class EncuentraDisco extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        //response.sendRedirect("encuentra-discos");

        String name = request.getParameter("authorName");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<center><h1>Busqueda Autor</h1></center>");
        out.println("<center><h3>" + (gestorcons.buscaAutor(name))[0] + "</h3></center>");
        out.println("<br/>");
        out.println("<center><a href='index.jsp'>Volver a inicio</href></center>");
        out.println("</body></html>");


    }

    GestorConsultas gestorcons = new GestorConsultas();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("authorName");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<center><h1>Busqueda Autor</h1></center>");
        out.println("<center><h3>" + (gestorcons.buscaAutor(name))[0] + "</h3></center>");
        out.println("<br/>");
        out.println("<center><a href='index.jsp'>Volver a inicio</href></center>");
        out.println("</body></html>");

    }
}