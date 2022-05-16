var express = require('express');
var router = express.Router();
var schemas = require('../models/schemas.js');

/* GET users listing. */
router.get('/:id', async(req, res, next) => {
  /*
    const data = mySchemas.find({
    $or: [
      { 'deleted': { $eq: false}},
      { 'deleted': { $exist: false}},
    ]
  });
  data
      .then(result => {
        const game = {
          id: 'adw8da7da8wd78aads987a9',
          gamers: result,
          inProgress: false
        }
        res.json(game);
      })
      .catch(err => console.log(err));
      */

  var data ={
    title: 'Juego de dados',
    img: '../public/images/neflix-logo.png',
    desc: '<p>Descripcion a poner</p>'
  };
  res.render('movies', {data:data});

});

module.exports = router;
