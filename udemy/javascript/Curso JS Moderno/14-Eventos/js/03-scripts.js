const busqueda = document.querySelector('.busqueda');

// busqueda.addEventListener('keydown', () => {
//      console.log('escribiendo...');
// });

// busqueda.addEventListener('keyup', () => {
//      console.log('escribiendo...');
// });

// busqueda.addEventListener('blur', () => {
//      console.log('escribiendo...');
// });

// busqueda.addEventListener('copy', () => {
//      console.log('escribiendo...');
// });

// busqueda.addEventListener('cut', () => {
//      console.log('escribiendo...');
// });

busqueda.addEventListener('input', (e) => {
     if(e.target.value===''){
          console.log('falló la validación');
     }
});