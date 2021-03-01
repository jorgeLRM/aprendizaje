nombre = 'Antonio'
print('Buenos dias ' + nombre)

#.format
edad = 18
print('Buenos dias {}, feliz {} cumpleaños'.format(nombre,edad))

resultado = 10 / 3
print('El resultado es {r}'.format(r=resultado))
print('El resultado es {r:1.3f}'.format(r=resultado))

#f-strings
nombre = 'Antonio'
edad = 18
print(f'Buenos dias {nombre}, feliz {edad} cumpleaños')