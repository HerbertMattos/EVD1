package br.com.evd.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	private static final String USUARIO = "root";
	private static final String SENHA = "1572";
	private static final String URL = "jdbc:mysql://localhost:3306/EVD";
	private static ConexaoFactory conect;

	public static ConexaoFactory getInstance() {
		
		if (conect == null) {
			conect = new ConexaoFactory();
		}
		return conect;
	}
	public Connection Conectar() throws SQLException {

		return DriverManager.getConnection(URL, USUARIO, SENHA);


	}

}