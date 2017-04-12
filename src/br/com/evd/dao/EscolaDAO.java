package br.com.evd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.evd.domain.Escola;
import br.com.evd.factory.ConexaoFactory;

public class EscolaDAO {
	
	public void salvar(Escola e) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO escola ");
		sql.append("(matricula, nome, cnpj) ");
		sql.append("VALUES (?, ?, ?) ");
		
		Connection conexao = ConexaoFactory.getInstance().Conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, e.getMatricula());
		comando.setString(2, e.getNome());
		comando.setString(3, e.getCnpj());
		comando.executeUpdate();
		
	}

}
