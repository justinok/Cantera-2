package com.codeteam.crudcode.Service;
// importaciones necesarias
import com.codeteam.crudcode.model.Tarea;

import java.util.List;

/**
 *  Clase usada para crear las
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
public interface ITareaService {
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);




}
