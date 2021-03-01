
/* Function declaraions */
function saludar(nombre) {
     if(typeof nombre == 'undefined') {nombre = 'Jorge'}
     console.log(`Hola ${nombre}`);
}

function saludar(nombre = 'Visitante') {
     return `Hola ${nombre}`;
}

//saludar();

function sumar(a, b) {
     console.log(a + b);
}

/*sumar(1, 2);
sumar(3, 4);*/

function restar(a, b) {
     return a - b;
}

let resta;

resta = restar(2, 1);

//console.log(resta);

/*Function expression */ 
const suma = function(a = 3, b = 4) {
     return a + b;
}

console.log( suma(1, 2) );

(function(tecnologia) {
     console.log(`Aprendiendo ${tecnologia}`);
})('JavaScript');

//Métodos de propiedad
// Cuando una función se pone dentro de un objeto
const musica = {
     reproducir: function(id) {
          console.log('Reproduciendo canción ${id}');
     },
     pausar: function() {
          console.log(`Pause a la música`);
     }
}

// Los método tambien pueden agregarse fuera del objeto
musica.borrar = function(id) {
     console.log(`Borrando la canción con el ID: ${id}`);
}

musica.reproducir(30);
musica.pausar();