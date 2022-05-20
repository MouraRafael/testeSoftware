package br.com.escola.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.escola.model.entidade.Aluno;

public class AlunoDao extends Conexao {
	
	public Aluno buscarPorId (long id) {
		
		String sql = "SELECT * FROM aluno WHERE id = ?";
		
		Aluno a = null;
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setLong(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				a = new  Aluno();
				a.setId(rs.getLong("id"));
				a.setNome(rs.getString("nome"));
				a.setNota1(rs.getDouble("nota1"));
				a.setNota2(rs.getDouble("nota2"));
				a.setNota3(rs.getDouble("nota3"));
			
				System.out.print(a.getId()+" - "+a.getNome()+" - "+a.getNota1());
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			fecharConexao();
		}
		
		return a;
		
		
		
	}

	public ArrayList<Aluno> listar(String nomeBusca) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		String sql = "SELECT * FROM aluno WHERE nome LIKE ? ORDER BY nome";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, "%"+ nomeBusca +"%");
			
			ResultSet rs = ps.executeQuery();
			Aluno a = null;
			
			while(rs.next()) {
				a = new Aluno();
				a.setId(rs.getLong("id"));
				a.setNome(rs.getString("nome"));
				a.setNota1(rs.getDouble("nota1"));
				a.setNota2(rs.getDouble("nota2"));
				a.setNota3(rs.getDouble("nota3"));
				
				lista.add(a);
			}
			
		}
		catch(SQLException e) {
			
		}
		
		return lista;
	}

	public String incluir(Aluno aluno) {
		String mensagem = "";
		String sql = "INSERT INTO aluno (nome,nota1,nota2,nota3) "
				+ "VALUES(?,?,?,?)";
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setDouble(2, aluno.getNota1());
			ps.setDouble(3, aluno.getNota2());
			ps.setDouble(4, aluno.getNota3());
			
			ps.execute();
			
			mensagem = "Cadastrado com sucesso";  
			
		}catch(SQLException e) {
			e.printStackTrace();
			mensagem = "Erro no cadastro";
		}finally {
			fecharConexao();
		}
		
		
		return mensagem;
	}
	
	
	public String alterar(Aluno a) {
		String mensagem = "";
		String sql = "UPDATE aluno SET "
				+ "nome = ?, "
				+ "nota1 = ?, "
				+ "nota2 = ?, "
				+ "nota3 = ? "
				+ "WHERE id = ? ";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, a.getNome());
			ps.setDouble(2, a.getNota1());
			ps.setDouble(3, a.getNota2());
			ps.setDouble(4, a.getNota3());
			ps.setLong(5, a.getId());
			
			ps.execute();
			
			mensagem = "alterado com sucesso";
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			mensagem = "falha em alterar";
		}finally {
			fecharConexao();
		}
		
		return mensagem;
	}
	
	

	public String excluir(int i) {
		//return "Excluído com Sucesso";
		String mensagem = "";
		String sql = "DELETE FROM aluno WHERE id = ?";
		
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setInt(1, i);
			
			ps.execute();
			mensagem = "Excluído com Sucesso";
			
		}catch(SQLException e) {
			e.printStackTrace();
			mensagem = "Erro ao excluir";
		}finally {
			fecharConexao();
		}
		
		
		return mensagem;
	}
	
	
	
}
