package com.codeteam.crudcode.Controller;

// importaciones necesarias

import com.codeteam.crudcode.Service.ITareaService;
import com.codeteam.crudcode.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  Esta clase sirve como el controlador de todo el proyecto, desde aqui
 *  mapeamos los servicios que hemos creado en el proecto para poder darles
 *  una ruta
 *  ex :
 *  Funcion borrar
 *  @delete maping en:
 *  localhost:8080/delete
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */


/**
 * @RestController Le decimos que es el controlador,
 * @CrossOrigin le ponemos el asterisco para señalar que cualqueira
 * puede ser el origen
 * @RequestMapping Señalamos a ruta de acceso
 */
@RestController
@CrossOrigin (origins = {"*"})
@RequestMapping ("/api")
public class TareaController {

    // autowire para traer la inferfaz de servicio de la tarea (copilar base de
    // datos)
    @Autowired
    private ITareaService iTareaService;

    //listar todos los registros telefonicos
    @GetMapping("/phone")
    public List<Tarea> listar() {
        return iTareaService.findAll();
    }

    //Guardar un nuevo registro telefonico
    @PostMapping("/phone")
    public Tarea guardar(@RequestBody Tarea tarea){
        return iTareaService.save(tarea);
    }

    // get un registro telefonico
    @GetMapping("/phone/{id}")
    public Tarea getUnaTarea(@PathVariable Integer id){
        return iTareaService.findById(id);
    }

    // Modificar un registro
    @PutMapping("/phone/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id){
        Tarea tareaActual= iTareaService.findById(id);
        tareaActual.setName(tarea.getName());
        tareaActual.setNumber(tarea.getNumber());
        tareaActual.setBorn_date(tarea.getBorn_date());
        tareaActual.setE_mail(tarea.getE_mail());
        tareaActual.setFinalizado(tarea.getFinalizado());

        return iTareaService.save(tareaActual);
    }

    // borrar un registro
    @DeleteMapping("/phone/{id}")
    public void eliminar(@PathVariable Integer id ){
        iTareaService.delete(id);
    }
}
