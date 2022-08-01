package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DentistaServlet
 */
public class DentistaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DentistaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter out = response.getWriter();
		
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String centro = request.getParameter("centro");
		String tipo = request.getParameter("tipo");
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
		
		out.println("<h1>Resumen de la cita</h1>");
		out.println("<ul>");
		out.println("<li>Dia de la cita: "+dia+"</li>");
		out.println("<li>Hora de la cita: "+hora+"</li>");
		out.println("<li>Nombre: "+nombre+"</li>");
		out.println("<li>Apellidos: "+apellidos+"</li>");
		out.println("<li>Centro Elegido: "+centro+"</li>");
		out.println("<li>Tipo de cita: "+tipo+"</li>");
		
		out.println("</body>\r\n"
				+ "</html>");
		
	}

}
