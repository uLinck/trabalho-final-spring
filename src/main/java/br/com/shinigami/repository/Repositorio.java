package br.com.shinigami.repository;


import br.com.shinigami.exceptions.BancoDeDadosException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio<OBJETO> {
    Integer getProximoId(Connection connection) throws SQLException;

    OBJETO create(OBJETO object) throws BancoDeDadosException;

    void delete(Integer id) throws BancoDeDadosException;

    OBJETO update(Integer id, OBJETO objeto) throws BancoDeDadosException;

    List<OBJETO> list() throws BancoDeDadosException;
}
