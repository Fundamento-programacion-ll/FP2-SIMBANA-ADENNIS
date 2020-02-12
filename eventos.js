const EventEmitter = require("events");

class eventoUno extends EventEmitter{}

    var instanciaEventoUno = new eventoUno();

    instanciaEventoUno.on("saludar",respuesta=>{
        console.log("hola",respuesta);
        console.log(`dsaaaaaaaaaaaaaaaaaaaaa
        knkjnkjnkjnk
        jhbjhbjhbjhbjhbs ${respuesta}`);
    });

    instanciaEventoUno.emit('saludar', 'Paul');

