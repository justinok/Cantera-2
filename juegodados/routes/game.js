/**
 * Clase game creada para obtener la informacion de cada juego usando el id del
 * juego mediante una ruta GET, en la ruta:
 * http://localhost:3000/game/fffff-ggg-jjjjj
 * donde fffff-ggg-jjjjj es el id del juego que se desea consultar
 *
 * @version 1.00.000 2022-05-17
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */


/**
 * Dependencias de la clase
 */
var express = require('express');
var router = express.Router();
var schemas = require('../models/schemas.js');




/** GET para recibir la informacion del juego, puede enviar error o enviar la
 * informacion como un JSON
 * **/



router.get('/:id', async(req,
                         res, next) => {
  schemas.signup.findById(req.params.id, (err, user) => {
    err && res.status(500).send(err.message);

    res.status(200).json(user)

  });



});


module.exports = router;
