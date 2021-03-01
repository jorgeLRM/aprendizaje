const nav = document.querySelector('.navegacion');

// registrar un evento
// nav.addEventListener('click', () => {
//      console.log('click en nav');
// });

// nav.addEventListener('mouseentered', () => {
//      console.log('entrada a la navegación');
// });

// nav.addEventListener('mouseout', () => {
//      console.log('saliendo a la navegación');

//      nav.style.backgroundColor = 'transparent';
// });

nav.addEventListener('mouseenter', () => {
     console.log('entrada a la navegación');
     nav.style.backgroundColor = 'white';
});

// mousedown - similar alc click
// click
// dblclick - dobleclick
// mouseup - cuando 