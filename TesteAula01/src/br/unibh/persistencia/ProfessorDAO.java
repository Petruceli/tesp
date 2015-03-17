package br.unibh.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;



public class ProfessorDAO implements DAO <Professor, Long>{

	@Override
	public Professor find(Long id) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().
					prepareStatement("select * from tb_professor where id = ?");
			p.setLong(1, id);
			ResultSet r = p.executeQuery();
			if (r.next()){
				return new Professor(r.getLong("id"),
						r.getString("nome"),
						r.getString("cpf"),
						r.getBigDecimal("salario")
						);
			}
			JDBCUtil.closeConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
