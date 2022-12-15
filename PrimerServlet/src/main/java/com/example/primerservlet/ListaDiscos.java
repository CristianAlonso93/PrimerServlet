package com.example.primerservlet;


import java.io.*;

import com.example.primerservlet.Modelo.GestorConsultas;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "ListaDiscos", value = "/lista-discos")
public class ListaDiscos extends HttpServlet{

    GestorConsultas gestorcons = new GestorConsultas();

    String [] autores = gestorcons.listaAutores();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Lista de discos</h1>");
        out.println("<ol>");
        for( int i=0; i<5; i++){
            out.println("<h3><li>" + autores[i] + "</li></h3>");
        }
        out.println("</ol>");
        out.println("<br/>");
        out.println("<a href='index.jsp'>Volver a inicio</href>");
        out.println("</body></html>");

    }

}
