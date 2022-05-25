package com.codeteam.crudcode.Dao;

import com.codeteam.crudcode.model.Tarea;
import org.springframework.data.repository.CrudRepository;

/**
 *  Inerfaz de registros telefonicos para aplicar el DAO
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
public interface ITareaDao extends CrudRepository<Tarea,Integer > {
}
