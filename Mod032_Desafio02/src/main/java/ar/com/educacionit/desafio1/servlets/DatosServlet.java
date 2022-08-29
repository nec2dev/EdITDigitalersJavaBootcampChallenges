package ar.com.educacionit.desafio1.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	protected void proceso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtengo una sesion
		HttpSession session = request.getSession();
		// lista de productos desde session
		List<String> listaProducto = (List<String>) session.getAttribute("misProductos");
		if (listaProducto == null) {
			listaProducto = new ArrayList<String>();
			session.setAttribute("misProductos", listaProducto);

		}
		// recibo los datos del formulario
		String[] producto = request.getParameterValues("producto");
		// guardo en la lista
		if (producto != null) {
			for (String valor : producto) {
				listaProducto.add(valor);
			}
		}

		// redireccionar
		response.sendRedirect("carrito.jsp");
		// request.getRequestDispatcher("bienvenido.jsp").forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proceso(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proceso(request, response);
	}

}
