const numeros = [10,20,30,40,50];
//console.log(numeros);

// Arreglo de Strings (método alternativo)
const meses = new Array('Enero','Febrero','Marzo','Abril');
//console.log(meses);
//console.log(meses.length);
//console.log(Array.isArray(meses));
//console.log(meses[1]);

// Añadir en un arreglo
meses[4] = 'Mayo';
meses.push('Junio');

// Encontrar un elemento en el arreglo
console.log(meses.indexOf('Abril'));

// Añadir al inicio del arreglo
meses.unshift('Meses 0');

// Eliminar un elemento de un arreglo
meses.pop();

// Eliminar un elemento del inicio
meses.shift();

// Quitar un arreglo
meses.splice(2, 1);

// Revertir
meses.reverse();

// Unir un arreglo con otro
let arreglo1 = [1,2,3],
     arreglo2 = [9,8,7];
//console.log(arreglo1.concat(arreglo2));

// Ordenar un arreglo
const frutas = ['Platano','Manzana','Fresa','Naranja'];
frutas.sort();
console.log(frutas);

// Ordenar números
arreglo1 = [3,9,91,92,23,45,21,56,1,100,10];
//arreglo1.sort();
arreglo1.sort(function(x,y) {
     return x - y;
});
console.log(arreglo1);

// Arreglo mezclado
const mezclado = ['Hola',20,true,null,false,undefined];
//console.log(mezclado);