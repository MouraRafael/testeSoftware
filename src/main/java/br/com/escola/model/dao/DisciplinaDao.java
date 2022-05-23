package br.com.escola.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.escola.model.entidade.Disciplina;

public class DisciplinaDao extends Conexao {
	public ArrayList<Disciplina> listar(String nomeBusca){
		ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
		String sql = "SELECT * FROM disciplina WHERE nome LIKE ? ORDER BY nome";
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			
			ResultSet rs = ps.executeQuery();
			Disciplina d = null;
			
			while(rs.next()) {
				d = new Disciplina();
				d.setId(rs.getLong("id"));
				d.setNome(rs.getString("nome"));
				d.setCargaHoraria(rs.getInt("carga_horaria"));
				
				lista.add(d);
				
				}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			fecharConexao();
		}
		
				
		return lista;
	}
}
