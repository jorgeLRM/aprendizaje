const pendientes = ['Tarea','Comer','Proyecto','Estudiar JavaScript'];

const carrito = [
     { nombre:'Monitor 27 Pulgadas', precio: 500 },
     { nombre:'Television', precio: 100 },
     { nombre:'Tablet', precio: 200 },
     { nombre:'Audífonos', precio: 300 },
     { nombre:'Teclado', precio: 400 },
     { nombre:'Celular', precio: 700 }
];

for(let pendiente of pendientes){
     console.log(pendiente);
}

for(let producto of carrito){
     console.log(producto.nombre);
}