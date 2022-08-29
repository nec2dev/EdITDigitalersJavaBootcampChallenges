package com.educacionit.jse.integrador.baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws Exception {

		// driver y datos de la base a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbConnString = "jdbc:mysql://localhost/base";
		String dbUser = "root";
		String dbPassword = "";

		// driver de conexion
		Class.forName(dbDriver).newInstance();

		// Retorna la conexion
		Connection conn = DriverManager.getConnection(dbConnString, dbUser, dbPassword);
		return conn;
	}

}
