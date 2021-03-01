const dropdownsToggle = document.querySelectorAll('.js-dropdown-toggle');

dropdownsToggle.forEach( element => {
    element.addEventListener('click', function(e) {
        const dropdownMenu = element.nextElementSibling;
        if(dropdownMenu.style.display === 'block'){
            dropdownMenu.style.display = 'none';
        }
        else{
            dropdownMenu.style.display = 'block';
        }
    });
});