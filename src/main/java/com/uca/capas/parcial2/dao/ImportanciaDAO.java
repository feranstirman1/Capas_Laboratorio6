package com.uca.capas.parcial2.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.parcial2.domain.Importancia;

public interface ImportanciaDAO {

	public List<Importancia> findAll() throws DataAccessException;
	public Importancia findOne(Integer codigo) throws DataAccessException;
}
