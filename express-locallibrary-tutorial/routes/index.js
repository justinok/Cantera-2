var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Cantera 2 te amo - Hola mundo' });
});

module.exports = router;
