package com.gsd.programacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static final String URL = "jdbc:mariadb://localhost:3306/taller_mecanico";
	public static final String USUARIO = "root";
	public static final String PASSWORD = "";
	
    public static void main(String[] args) {
    	System.out.println("Intentando conectar a la base de datos...");
    
	    // CONEXION
	    try(Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)){
	    	System.out.println("Conectado con exito!");
	    	
	    	//SELECT
	    	String tabla = "mecanicos";
	    	System.out.println("\n---- MOSTRANDO DATOS DE LA TABLA " + tabla.toUpperCase() + "-----");
	    	try(Statement stmt = conn.createStatement();
	    		ResultSet rs = stmt.executeQuery("SELECT * FROM " + tabla)){
	    		
	    		ResultSetMetaData meta = rs.getMetaData();
	    		int columnas = meta.getColumnCount();
	    		
	    		for (int i = 1; i <= columnas; i++) {
					System.out.printf("%-20s", meta.getColumnName(i));
				}
	    		System.out.println("\n" + "-".repeat(columnas*20));
	    		
	    		while(rs.next()) {
	    			for (int i = 1; i <= columnas; i++) {
						System.out.printf("%-20s", rs.getString(i));
					}
	    			System.out.println();
	    		}
	    	}	   
	    	// INSERT
	    	
	    	System.out.println("\n---- INSERTANDO UN NUEVO MECANICO ----");
	    	String sqlInsert = "INSERT INTO mecanicos (NIF, Nombre, Apellido1, Direccion, Provincia, Sueldo) VALUES (?,?,?,?,?,?)";
	    	try(PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert)){
	    		pstmtInsert.setString(1, "9999999Z");
	    		pstmtInsert.setString(2, "CARLOS");
	    		pstmtInsert.setString(3, "PÉREZ");
	    		pstmtInsert.setString(4, "Calle manolito 1");
	    		pstmtInsert.setString(5, "MADRID");
	    		pstmtInsert.setDouble(6,1500.50);
	    		
	    		int filasAfectadas = pstmtInsert.executeUpdate();
	    		System.out.println("INSERCION COMPLETADA. FILAS AFECTADAS: " + filasAfectadas);
	    	}
	    	
	    	// UPDATE 
	    	System.out.println("\n--- ACTUALIZANDO EL SUELDO DE CARLOS ---");
	    	String sqlUpdate = "UPDATE mecanicos SET Sueldo = ? WHERE NIF = ?";
	    	try(PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)){
	    		pstmtUpdate.setDouble(1, 1900.00);
	    		pstmtUpdate.setString(2, "9999999Z");
	    		
	    		int filasActualizadas = pstmtUpdate.executeUpdate();
	    		System.out.println("ACTUALIZACION REALIZADA. FILAS AFECTADAS: " + filasActualizadas);
	    	}
	    	
	    	// BORRAR (DELETE)
	    	/*
	    	System.out.println("\n--- BORRAR MECÁNICO ---");
	    	String sqlDelete = "DELETE FROM MECANICOS WHERE NIF = ?";
	    	try(PreparedStatement pstmtDelete = conn.prepareStatement(sqlDelete)){
	    		pstmtDelete.setString(1, "9999999Z");
	    		
	    		int filasBorradas = pstmtDelete.executeUpdate();
	    		System.out.println("BORRADO COMPLETADO. FILAS ELIMINADAS: " + filasBorradas);
	    	}*/
	    	
	    }catch(SQLException e) {
	    	System.err.println("Error al conectar o ejecutar la consulta");
	    }
	}
}
