package com.gsd.programacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
	public static final String URL = "jdbc:mariadb://localhost:3306/taller_mecanico";
	public static final String USUARIO = "root";
	public static final String PASSWORD = "";
	
	public static void main(String [] args) {
		
		String tabla = "mecanicos";
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD))
			{
				System.out.println("Conectado con exito");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM " + tabla);
			ResultSetMetaData meta = rs.getMetaData();
			int columnas = meta.getColumnCount();
			
			for (int i = 1; i <= columnas; i++) {
				System.out.printf("%-20s" , meta.getColumnName(i));
			}
			System.out.println();
			System.out.println("-".repeat(columnas*20));
			
			while(rs.next()) {
				for (int i = 1; i <= columnas; i++) {
					System.out.printf("%-20s", rs.getString(i));
				}
				System.out.println();
			}
		} catch(SQLException e) {
			System.err.println("Error al conectar");
		}
	}
}
