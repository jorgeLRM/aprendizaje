// For Loops
const arregloProductos = ['Camisa', 'Boleto', 'Guitarra', 'Disco'];

for (let i = 0; i < arregloProductos.length; i++) {
    console.log(`Tu producto ${arregloProducto[i]} fue agregado`);
}

for (let i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        console.log(`El numero ${i} es Par`);
    } else {
        console.log(`El numero ${i} es Impar`);
    }
}

let i = 0;
while (i < 10) {
    if (i === 5) {
        console.log('Cinco');
        i++;
        continue;
    }
    console.log(`Numero: ${i}`);
    i++;
}

const musica = ['Cnacion 1', 'Cancion 2', 'Cancion 3'];

let i = 0;
while (i < musica.length) {
    console.log(`Reproduciendo la cancion: ${musica[i]}`);
    i++;
}

let i = 0;
do {
    console.log(`Numero: ${i}`);
    i++;
} while (i < 10);

//For each
const pendientes = ['Tarea', 'Comer', 'Proyecto', 'Aprender', 'JavaScript'];

pendientes.forEach(function(pendiente, index) {
    console.log(`${index}: ${pendiente}`);
});

const carrito = [
    { id: 1, producto: 'Libro' },
    { id: 2, producto: 'Camisa' },
    { id: 3, producto: 'Guitarra' },
    { id: 4, producto: 'Disco' }
];

const nombreProducto = carrito.map(function(carrito) {
    return carrito.producto;
});

console.log(nombreProducto);

const automovil = {
    modelo: 'Camaro',
    motor: 6.1,
    anio: 1969,
    marca: 'Chevrolet'
};

for (let auto in automovil) {
    console.log(`${auto}: ${automovil[auto]}`);
}

const ciudades = ['Londres', 'New York', 'Madrid', 'Paris'];
const ordenes = new Set([123, 231, 131, 102]);
const datos = new Map();
datos.set('nombre', 'juan');
datos.set('profesion', 'desarrollador web');

for (let entradas of ordenes.entries()) {
    console.log(entradas);
}

for (let entrada of ciudades) {
    console.log(entrada);
}

for (let entrada of ciudades.keys()) {
    console.log(entrada);
}

const mensaje = 'Aprendiendo JavaScript';

for (let letra of mensaje) {
    console.log(letra);
}

const enlaces = document.getElementById('a');

for (let enlace of enlaces) {
    console.log(enlace.href);
}