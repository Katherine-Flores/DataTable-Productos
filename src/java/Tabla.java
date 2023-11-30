/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Clases.ProductoController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author kathe
 */
@WebServlet(urlPatterns = {"/Tabla"})
public class Tabla extends HttpServlet {
    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("""
                                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
                                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
                                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
                                <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
                                <link rel="preconnect" href="https://fonts.googleapis.com">
                                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                                <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;800&display=swap" rel="stylesheet">
                                <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
                                <link rel="icon" href="img/box2-heart-fill.svg">
                                <meta charset="UTF-8">
                                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                                <title>DataTable</title>
                                <link rel="stylesheet" href="css/estilos.css">""");            
            out.println("</head>");
            out.println("<body>");
            out.println("""
                                <div class="menu">
                                    <i class='bx bx-menu'></i>
                                    <i class='bx bx-x'></i>
                                </div>
                                <div class="barra-lateral">
                                    <div>
                                        <div class="nombre-pagina">
                                            <img id="logo" src="img/Logo-black.svg" alt="MN">
                                            <span>Company</span>
                                        </div>
                                        <button class="boton" onclick="navegar('index.html#formulario')">
                                            <i class='bx bx-plus'></i>
                                            <span>Create new</span>
                                        </button>
                                    </div>
                                    <nav class="navegacion">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <i class='bx bx-search-alt-2'></i>
                                                    <span>Buscar</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="index.html">
                                                    <i class='bx bx-home-alt-2'></i>
                                                    <span>Inicio</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Tabla">
                                                    <i class='bx bx-table'></i>
                                                    <span>Mostrar tabla</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </nav>
                                    <div>
                                        <div class="linea"></div>
                                        <div class="modo-oscuro">
                                            <div class="info">
                                                <i class='bx bx-moon'></i>
                                                <span>Dark Mode</span>
                                            </div>
                                            <div class="switch">
                                                <div class="base">
                                                    <div class="circulo">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="usuario">
                                            <i class='bx bxs-user-circle'></i>
                                            <div class="info-usuario">
                                                <div class="nombre-email">
                                                    <span class="nombre">Katherine</span>
                                                    <span class="email">kflores@miumg.edu.gt</span>
                                                </div>
                                                <i class='bx bx-dots-vertical-rounded'></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>""");
            out.println("<main>");
            out.println("""
                        <h2 class="text-center">Productos Registrados</h2>
                           <div class="col-sm-12 col-me-12 col-lg-12 col-xl-12 table-responsive">
                               <table class="table table-dark table-bordered table-hover" id="tabla1">
                                   <thead class="thead-dark text-center">
                                       <tr>
                                           <th class="align-middle">C\u00f3digo</th>
                                           <th class="align-middle">Nombre</th>
                                           <th class="align-middle">Precio</th>
                                           <th class="align-middle">Cant. En Existencia</th>
                                           <th class="align-middle">Fecha</th>
                                           <th class="align-middle">Marca</th>
                                           <th class="align-middle">Categoria</th>
                                           <th class="align-middle">Opciones</th>
                                       </tr>
                                   </thead>
                                   <tbody class="text-center" id="bodyTable">""");
                        
            // Controlador
            ProductoController registroProducto = new ProductoController();
            StringBuffer respuestaTabla = new StringBuffer();
            // Obtener y mostrar los libros
            registroProducto.getProductos(respuestaTabla);
            out.println(respuestaTabla.toString());
            out.println("""
                                   </tbody>
                               </table>
                           </div> """);            
            out.println("</main>");
            out.println("<script src=\"js/barra-lateral.js\">");
            out.println("</script>");
            out.println("<script src=\"js/script.js\" type=\"text/javascript\"></script>");
            out.println("</body>");
            out.println("</html>");
            
        }
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
