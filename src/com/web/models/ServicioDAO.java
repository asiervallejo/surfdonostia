package com.web.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioDAO {
	public ArrayList<Servicio> listadoServiciosDAO(){
		ArrayList<Servicio> listaServicios=new ArrayList<Servicio>();
		
		//Conexion
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet resultado=null;
		
		conn=Conexion.conn();
		
		String sql="SELECT id,nombre,descripcion,precio FROM servicios";
		
		try {
			pstmt=conn.prepareStatement(sql);
			resultado=pstmt.executeQuery();
			while (resultado.next()) {
				Servicio servicio= new Servicio();
				servicio.setId(resultado.getInt("id"));
				servicio.setNombre(resultado.getString("nombre"));
				servicio.setDescripcion(resultado.getString("descripcion"));
				servicio.setPrecio(resultado.getDouble("precio"));
				
				listaServicios.add(servicio);
			}
			
			if(resultado!=null)try {resultado.close();}catch(SQLException logIgnore) {};
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(resultado!=null)try {resultado.close();}catch(SQLException logIgnore) {};
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
		}
			
		return listaServicios;
		
	}
	
	public boolean agregarServiciosDAO(Servicio servicio){
		System.out.println(servicio);
		boolean acceso=false;
		//Conexion
		Connection conn=null;
		PreparedStatement pstmt=null;
		int resultado;
		
		conn=Conexion.conn();
		
		String sql="INSERT INTO servicios (nombre,descripcion,precio) VALUES (?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, servicio.getNombre());
			pstmt.setString(2, servicio.getDescripcion());
			pstmt.setDouble(3,servicio.getPrecio());
			resultado=pstmt.executeUpdate();
			if (resultado!=0) {
				acceso=true; 
			}
			

			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
		}
			
		return acceso;
		
	}
	
	public boolean eliminarServicioDAO(int id){

		//Variables de conexion:
		Connection conn=null;
		PreparedStatement pstmt=null;
		int resultado;
		boolean borrar=true;
		
		//Llamar a la conexion
		conn=Conexion.conn();
		String sql="DELETE FROM servicios WHERE id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			//parametros
			pstmt.setInt(1,id);
			resultado=pstmt.executeUpdate();
			if (resultado==0)
				borrar=false;
							
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Opcional para cerrar por si acaso
		finally {
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
		}
		return borrar;
		
	}
	public Servicio datosServicioDAO(int id){
		Servicio servicio=new Servicio();
		
		//Conexion
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet resultado=null;
		
		conn=Conexion.conn();
		
		String sql="SELECT id,nombre,descripcion,precio FROM servicios WHERE id=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			resultado=pstmt.executeQuery();
			if (resultado.next()) {

				servicio.setId(resultado.getInt("id"));
				servicio.setNombre(resultado.getString("nombre"));
				servicio.setDescripcion(resultado.getString("descripcion"));
				servicio.setPrecio(resultado.getDouble("precio"));
			
			}
			
			if(resultado!=null)try {resultado.close();}catch(SQLException logIgnore) {};
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(resultado!=null)try {resultado.close();}catch(SQLException logIgnore) {};
			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
		}
			
		return servicio;
		
	}
	
	public boolean editarServicioDAO(Servicio servicio){
		System.out.println(servicio);
		boolean acceso=false;
		//Conexion
		Connection conn=null;
		PreparedStatement pstmt=null;
		int resultado;
		
		conn=Conexion.conn();
		
		String sql="UPDATE servicios SET nombre=?,descripcion=?,precio=? WHERE id=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, servicio.getNombre());
			pstmt.setString(2, servicio.getDescripcion());
			pstmt.setDouble(3,servicio.getPrecio());
			pstmt.setDouble(4,servicio.getId());
			resultado=pstmt.executeUpdate();
			if (resultado!=0) {
				acceso=true; 
			}
			

			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if(pstmt!=null)try {pstmt.close();}catch(SQLException logIgnore) {};
			if(conn!=null)try {conn.close();}catch(SQLException logIgnore) {};
		}
			
		return acceso;
		
	}
	

}
