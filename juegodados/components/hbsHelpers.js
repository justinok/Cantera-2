/**
 * Clase creada para poder usar tipologia especial en hbs, informacion
 * sobre los helpers de HBS se puede encontrar en:
 * https://www.npmjs.com/package/hbs-helpers
 *
 * @version 1.00.000 2022-05-17
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */



var helper = {
    if_cond: (v1, op, v2, options) => {
        switch (op) {
            case '==':
                return (v1 == v2) ? options.fn(this) : options.inverse(this);
            case '===':
                return (v1 === v2) ? options.fn(this) : options.inverse(this);
            case '!=':
                return (v1 != v2) ? options.fn(this) : options.inverse(this);
            case '!==':
                return (v1 !== v2) ? options.fn(this) : options.inverse(this);
            case '<':
                return (v1 < v2) ? options.fn(this) : options.inverse(this);
            case '<=':
                return (v1 <= v2) ? options.fn(this) : options.inverse(this);
            case '>':
                return (v1 > v2) ? options.fn(this) : options.inverse(this);
            case '>=':
                return (v1 >= v2) ? options.fn(this) : options.inverse(this);
            case '&&':
                return (v1 && v2) ? options.fn(this) : options.inverse(this);
            case '||':
                return (v1 || v2) ? options.fn(this) : options.inverse(this);
            default:
                return options.inverse(this);
        }
    },
    shortText: (text, n) => {
        return text.substring(0, n-1);
    }
};

module.exports = helper;