/**
 * Clase para agrupar rutas necesarias para que el juego pueda funcionar
 * correctamente.
 *
 *
 * @version 1.00.000 2022-05-17
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */

/** Dependencias de la clase **/

var express = require('express');
var router = express.Router();
var schemas = require('../models/schemas.js');

/**
 * Get para renderizar la homepage desde views/index.hbs
 */
router.get('/', async(req,
                      res, next) => {

  res.render('index', {title:'Casino de las canteras',
    playername:''});

});

/**
 * Metodo POST para publicar la informacion de los jugadores y las apuestas
 */
router.post('/createGame', async(
    req, res) => {

  //Llamamos los datos que introducen mediante el HTML/HBS
  var playername = req.body.playername;
  var betplayername = req.body.betplayername;
  var playername2 = req.body.playername2;
  var betplayername2 = req.body.betplayername2;

  /**
  //Llamamos el esquema necesario y revisamos si el nombre ya ha sido
  //introducido debido a la gran cantidad de pruebas para no llenar la base de
  //datos con nombres como "asdad" o "fsgw" xD
   **/
  let signup = schemas.signup;
  let signupExist = await signup.findOne({playername:playername})
      .exec( async(err,
                   result) => {
    if (!result) {
        let newEmail = new schemas.signup({playername:playername,
          betplayername:betplayername,playername2:playername2,
          betplayername2:betplayername2});
        let saveEmail = await newEmail.save( (err, emailResult) => {});
    }
  });

  res.render('index', {title:'Casino',playername2:playername2 ,
    playername:playername});

});

module.exports = router;
