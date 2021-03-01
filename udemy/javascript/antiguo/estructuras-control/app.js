const edad = 18;

if (edad > 18) {
    console.log('Si puedes entrar al sitio');
} else {
    console.log('No puedes entrar al sitio');
}

// Comprobar que una variable tiene un valor
let puntaje = 1000;

if (puntaje) {
    console.log(`El puntaje fue de ${puntaje}`);
} else {
    console.log(`No hay puntaje`);
}

let efectivo = 500;
let totalCarrito = 300;

if (efectivo > totalCarrito) {
    console.log('Pago Correcto');
} else {
    console.log('Fondos Insuficientes');
}

const logueado = true;

console.log(logueado === true ? 'Usuario logueado' : 'Usuario no logueado');