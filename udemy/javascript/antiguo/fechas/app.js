//En JavaScript existe un objeto llamdo Date
const diaHoy = new Date();

//Fecha en específico Mes, Día y año
let navidad2017 = new Date('12-25-2017');

let valor;
//Mes
valor = diaHoy.getMonth();
//Dia
valor = diaHoy.getDay();
//Año
valor = diaHoy.getFullYear();
//Minutos
valor = diaHoy.getMinutes();
//Horas
valor = diaHoy.getHours();

//Milisegundos desde 1970
valor = diaHoy.getTime();

valor = diaHoy.getFullYear();
valor = diaHoy.setFullYear(2016);
valor = diaHoy.getFullYear();

console.log(valor);