/*const numeros = [1,2,3];

numero[0] = 4;
numeros.push(5);

console.log(numeros);*/

const persona = {
     nombre: 'Miguel',
     apellido: 'Martinez',
     profesion: 'Diseñador gráfico',
     email: 'correo@correo.com',
     edad: 21,
     musica: ['Trance','Rock','Grunge'],
     hogar: {
          ciudad: 'Guadalajara',
          pais: 'Mexico'
     },
     nacimiento: function() {
          return new Date().getFullYear() - this.edad;
     }
};

const autos = [
     {modelo: 'Mustang',motor: 6.0},
     { modelo: 'Camaro', motor: 6.1},
     {modelo: 'Challenger',motor: 6.3}
];

//console.log(persona.nacimiento());
//console.log(autos);

for(let i = 0; i < autos.length; i++)
{
     //console.log(autos[i]);
     console.log(`${autos[i].modelo} ${autos[i].motor}`);
}