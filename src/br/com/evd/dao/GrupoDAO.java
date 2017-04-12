package br.com.evd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.evd.domain.Grupo;
import br.com.evd.factory.ConexaoFactory;

public class GrupoDAO {
	
	public void salvar(Grupo e) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO grupo ");
		sql.append("(idGrupo, nome, assunto, obs, senha) ");
		sql.append("VALUES (?, ?, ?, ?, ?) ");
		
		Connection conexao = ConexaoFactory.getInstance().Conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, e.getId());
		comando.setString(2, e.getNome());
		comando.setString(3, e.getAssunto());
		comando.setString(4, e.getObs());
		comando.setString(5, e.getSenha());
		comando.executeUpdate();
		
	}

}
