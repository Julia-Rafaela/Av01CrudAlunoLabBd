package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Telefone;

public interface ITelefone {
	List<Telefone> listar(String nomeAluno) throws SQLException, ClassNotFoundException;
}
