package servicios.vehiculo;

import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import core.TransformacionObjetos;
import datos.VehiculosJDBC;
import domain.Vehiculo;



@WebServlet("/vehiculo/verDetallesPorId")
public class VerDetallesPorIdVehiculo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idVehiculoReq = Integer.parseInt(request.getParameter("idVehiculo"));
		
		List<Vehiculo> listaDetalles = VehiculosJDBC.selectDetallesById(idVehiculoReq);
		
		String json = TransformacionObjetos.obtenerJson(listaDetalles);
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		out.print(json);
		out.flush();
	}

}