/**
 * La clase schemas fue creada para sintetizar todos los esquemas necesarios
 * que seran mandados a la base de datos de Mongo
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
var mongoose = require('mongoose');
var schema = mongoose.Schema;


// genre
let genreSchema = new schema({
    winner: {type:String, required:true}
});

/**
 * Esquema para registrar los datos de los jugadores, se registra los nombres
 * y las apuestas de cada jugador al igual que la fecha del juego
 * @type {module:mongoose.Schema<any, Model<any, any, any, any>, {}, {}>}
 */
let signupSchema = new schema({
    playername: {type:String, required:true},
    betplayername: {type:String, required:true},
    playername2: {type:String, required:true},
    betplayername2: {type:String, required:true},
    entryDate: {type:Date, default:Date.now}
});

/** Creacion del modelo para exportar los esquemas
 *
 * @type {Model<DocType>} Modelos en Moongose
 */
let genre = mongoose.model('genre', genreSchema, 'genre');
let signup = mongoose.model('signup', signupSchema, 'signup');
let mySchemas = {'genre':genre, 'signup':signup};

module.exports = mySchemas;