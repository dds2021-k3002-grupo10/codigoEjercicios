/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.servlets;

import ar.org.diseno.ejercicios2021.services.trasporte.strategyContexto.Envio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex
 */
public class servletTrasporte extends HttpServlet {

    private RequestDispatcher despachador = null;
    private static final String FORM_PRINCIPAL = "/view/ajax.jsp";
    private final Envio envio = new Envio();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        PrintWriter out = response.getWriter();
        try {
            String transportista = request.getParameter("transportista");
            String tipo = request.getParameter("tipo");
            Long distancia = Long.parseLong(request.getParameter("distancia"));
            Long peso = Long.parseLong(request.getParameter("peso"));

            float respuesta;

            respuesta = envio.getPrecioEnvio(transportista, tipo, distancia, peso);

            request.setAttribute("respuestaAjax", respuesta);

            despachador = getServletContext().getRequestDispatcher(FORM_PRINCIPAL);
            despachador.forward(request, response);
        } catch (Exception e) {
        } finally {
            out.close();
        }
    }

    private Boolean esVacio(String transportista, String tipo, Long distancia, Long peso) {
        Boolean resultado = true;
        if (transportista.isEmpty()) {
            resultado = false;
        }
        if (tipo.isEmpty()) {
            resultado = false;
        }
        if (distancia <= 0) {
            resultado = false;
        }
        if (peso <= 0) {
            resultado = false;
        }
        return resultado;
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
