package br.com.evd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.evd.domain.Tipo;
import br.com.evd.factory.ConexaoFactory;

public class TipoDAO {
	
	public void salvar(Tipo t) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tipo ");
		sql.append("(descricao) ");
		sql.append("VALUES (?)");

		Connection conexao = ConexaoFactory.getInstance().Conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, t.getDescricao());
		
		comando.executeUpdate();

	}

}
