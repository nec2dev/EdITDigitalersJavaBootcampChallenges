package com.educacionit.jse.integrador.baseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionit.jse.integrador.entidades.Alumno;
import com.educacionit.jse.integrador.excepciones.CafeStoreException;
import com.educacionit.jse.integrador.excepciones.NegocioException;

public class AlumnoDAO {

	public static void inserta(Alumno p) throws NegocioException, CafeStoreException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = AdministradorDeConexiones.obtenerConexion();
			String sql = "insert into Alumnos (dni, nombre,correo) values (?,?,?)";
			st = con.prepareStatement(sql);
			st.setDouble(1, p.getDni());
			st.setString(2, p.getNombre());
			st.setString(2, p.getCorreo());
			st.execute();
		} catch (Exception e) {
			throw new CafeStoreException();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new CafeStoreException();
			}

		}
	}

	public static void modifica(Alumno p) throws CafeStoreException, NegocioException {
		PreparedStatement st = null;
		Connection con = null;
		try {
		
			con = AdministradorDeConexiones.obtenerConexion();
			String sql = "update Alumnos set dni = ?, nombre = ?,correo=? where dni = ?";
			st = con.prepareStatement(sql);
			st.setInt(1, p.getDni());
			st.setString(2, p.getNombre());
			st.setString(3, p.getCorreo());
			st.execute();
		} catch (Exception e) {
			throw new CafeStoreException();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new CafeStoreException();
			}

		}
	}

	public static void elimina(int dni) throws NegocioException, CafeStoreException  {
		PreparedStatement st = null;
		Connection con = null;
		
		try {
			con = AdministradorDeConexiones.obtenerConexion();
			String sql = "delete from Alumnos where dni = ?";
			st = con.prepareStatement(sql);
			st.setInt(1, dni);
			st.execute();
		} catch (Exception e) {
			throw new CafeStoreException();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new CafeStoreException();
			}
		}
	}

	

	
	public static List<Alumno> getAlumnos() {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			con = AdministradorDeConexiones.obtenerConexion();
			String sql = "select * from Alumnos";
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Alumno p = new Alumno();
				int dni = rs.getInt("dni");
				String nombre = rs.getString("nombre");
				String correo = rs.getString("correo");
				p.setDni(dni);
				p.setNombre(nombre);
				p.setCorreo(correo);
				alumnos.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}
		return alumnos;
	}

}
