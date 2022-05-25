package com.codeteam.crudcode.Service;
// importaciones necesarias
import com.codeteam.crudcode.Dao.ITareaDao;
import com.codeteam.crudcode.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *  Clase donde implementaremos los distintos servicios que usaremos
 *  guardad, borrar, modificar, crear
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
@Service
public class TareaServiceImplement implements ITareaService{


    // Necesitamos decirle a cada parte que es Transaccional para que pueda
    // intercambiar informacion
    @Autowired
    private ITareaDao tareaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tarea> findAll() {
        return (List<Tarea>) tareaDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Tarea save(Tarea tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    @Transactional(readOnly = true)
    public Tarea findById(Integer id) {
        return tareaDao.findById(id) .orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        tareaDao.deleteById(id);
    }
}
