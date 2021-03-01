/**
 * ======================================
 * == LE PREGUNTA AL USUARIO SU NOMBRE ==
 * ======================================
 */
const nombre = prompt('Cual es tu nombre?');

// Toma el nombre y lo muestra en pantalla
document.querySelector('.contenido').innerHTML = `${nombre} está aprendiendo JavaScript Moderno`;

// Asigna el valor hacia la variable producto
const producto = 'Monitor 24 pulgadas';

console.time('Hola');

console.warn('Eso no esta permitido');
console.warn('Eso no esta permitido');
console.warn('Eso no esta permitido');

console.timeEnd('Hola');