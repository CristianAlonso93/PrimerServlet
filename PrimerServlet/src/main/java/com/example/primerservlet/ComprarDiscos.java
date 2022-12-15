package com.example.primerservlet;

import com.example.primerservlet.Modelo.GestorConsultas;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ComprarDiscos", value = "/ComprarDiscos")
public class ComprarDiscos extends HttpServlet {

    GestorConsultas gestorcons = new GestorConsultas();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        response.sendRedirect("encuentra-discos");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int disc = Integer.parseInt(request.getParameter("Disco"));

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<center><h1>Busqueda Autor</h1></center>");
        out.println("<center><h3>" + gestorcons.bajaDisco(disc) + "</h3></center>");
        out.println("<br/>");
        out.println("<center><a href='index.jsp'>Volver a inicio</href></center>");
        out.println("</body></html>");

    }
}