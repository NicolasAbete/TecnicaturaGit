'''
calcular la estacion del año
pedir al usuario q ingrese un mes del año, el valor
debe ser entre 1 y 12, luego le decimos en q estacion
del años esta
verano 21/12 al 21/03 (1,2,3)
otoño 21/03 al 21/06 (4,5,6)
invierno 21/06 al 21/09 (7,8,9)
primavera 21/09 al 21/12 (10,11,12)


mes = int(input("digite un mes del año (1-12): "))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Primavera"
else:
    estacion = "error no hay un numero para ese mes"
print(f"para el mes {mes} la estacion es: {estacion}")
'''
'''
haremos un programa q cuando el usuario ingrese su 
edad le diga, o imprima la etapa de su vida en una breve 
oracion
0-10 = la infancia es increible y bella
10-19 = tienes muchos cambios, mucho q estudiar
20-29 = amor y comienza el trabajo
para las siguientes etapas, deberas completarlo...
'''
'''
edad = int(input("digite su edad: "))
mensaje = None
if 0 <= edad < 10: # sintaxis simplificada
    mensaje = "La infancia es increible y bella"
elif 10 <= edad < 20:
    mensaje = "Tienes muchos cambios, mucho q estudiar"
elif 20 <= edad < 30:
    mensaje = "Amor y comienza el trabajo"
#debes agregar las demas edades
elif 30 <= edad < 40:
    mensaje = "Aun tienes mucho para dar"
elif 40 <= edad < 50:
    mensaje = "No te des por vencido"
elif 50 <= edad < 60:
    mensaje = "Empieza a pensar en jubilarte"
elif 60 <= edad < 70:
    mensaje = "Ya te jubilaste? "
elif 70 <= edad < 80:
    mensaje = "Piensa en cuanto has vivido"
elif 80 <= edad < 90:
    mensaje = "A los 100 no llegas"
else:
    mensaje = "Has muerto, feliz y contento !!!"
print(f"Tu edad es: {edad}, {mensaje} ")
'''
'''
sistema de calificaciones 
el objetivo del programa sera crear un sistema de 
calificaciones de la siguiente manera:
le pedimos al usuario q ingrese un valor del 0 al 10
luego si ingreso 9 o 10 imprimimos A
entre 8 y menor a 9 imprimimos B
entre 7 y menos a 8 imprimimos C
entre 6 y menos a 7 imprimimos D
entre 0 y menos a 6 imprimimos F
de lo contrario el valor dado es incorrecto
'''
'''
num = int(input("digite el numero de un numero: "))
valor = None
if num == 9 or num == 10:
    valor = "A"
elif 8 <= num < 9:
    valor = "B"
elif 7 <= num < 8:
    valor = "C"
elif 6 <= num < 7:
    valor = "D"
elif 0 <= num < 6:
    valor = "F"
else:
    valor = "el valor ingresado es incorrecto"
print(f"La calificacion {num} corresponde a la letra: {valor}")
'''
calificacion = int(input("digite una calificacion entre 0 y 10: "))
if 9 <= calificacion <= 10:
    print("A")
elif 8 <= calificacion < 9:
    print("B")
elif 7 <= calificacion < 8:
    print("C")
elif 6 <= calificacion < 7:
    print("D")
elif 0 <= calificacion < 6:
    print("F")
else:
    print("el valor es cincorrecto")



















