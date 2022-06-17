miVariable = 3
print(miVariable)
miVariable = "hola a todos"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# las literales se escriben x792, y536, z856
print(id(y))
print(id(z))

a = False
print(type(a))
'''
# Tipos int (enteros), float (flotantes o numerales), string(caracter), bool (booleanos)

 x = 10
 print(x)
 print(type(x))
 x = 14.5
 print(x)
 print(type(x))
 x = "Hola alumnos"
 print(x)
 print(type(x))
 x = True
 print(x)
 print(type(x))
 x = False
 print(x)
 print(type(x))
 
 # Manejo de cadenas (Strings)
miGrupoFavorito = "Kaleo " + "Banda de Rock Country"  # concatenamos 2 textos
caracteristicas = "Rock Country"
print("Mi Grupo Favorito es: " + miGrupoFavorito + " " + caracteristicas)  # concatena la variable junto
# con el texto q le queramos agragar


print('Mi Grupo Favorito es: ', miGrupoFavorito, caracteristicas)  # python asigna un
# espacio automaticamente

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)  # concatena los 2 numeros porq no los toma como enteros

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))  # ahora si los toma como enteros y los suma

numero1 = "7"  # "siete"
numero2 = "8"
print(int(numero1) + int(numero2))  # ahora si le ponemos letras en la variable nos tira error

# tipos boobleanos
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("el resultado es verdadero")
else:
    print("el resultado es falso")

# procesar la entrada del usuario
# funcion input
resultado = input("digite un numero: ")  # la funcion input regresa un dato tipo string
print(resultado)  # te permite poner o ingresar un numero despues de correr el programa

# conversion de la entrada de datos
nume1 = int(input("escribe el primer numero: "))
nume2 = int(input("escribe el segundo numero: "))
resultado = nume1 + nume2
print("el resultado de la suma es: ", resultado)
# si la funcion input no se le aclara que es una funcion entero con
# "int" solo va a concatenar
'''
print("")
libro = "Bodas de Odio"
autor = "Florencia Bonelli"
print("Proporciona el título: " + libro + " ", "Proporciona el Autor: " + autor)
print(libro, "fue escrito por", autor)
print("")
libro = input("Proporciona un titulo de un libro: ")
autor = input("Menciona el autor de ese libro: ")
print(libro, "y fue escrito por", autor)
'''
print("")
CalificaTuDia = input("Como estuvo tu dia: ")
print("Mi dia estuvo de ", CalificaTuDia)

print("")
operadorA = 8
operadorB = 5
suma = operadorA + operadorB
# print("el resultado de la suma :", suma)
print(f'el resultado d la suma es: {suma} ') # otra forma de imprimir es
# "f"  significa interpolacion imprime de manera directa todo el formato
# entonces incluimos la variable dentro las llaves ya que de esta manera se anulan pasos
 
print("")
resta = operadorA - operadorB
print(f"el resultado de la resta es : {resta}")
 
print("")
multiplicacion = operadorA * operadorB
print(f"el resultado de la multiplicacion es: {multiplicacion}")
 
print("")
division = operadorA / operadorB
print(f"el resultado de la division es: {division}")
 
print("")
division = operadorA // operadorB
# la dision se vuelve entera con "int" se le quita la coma
print(f"el resultado de la division int es: {division}")
 
print("")
modulo = operadorA % operadorB
print(f"el resultado de la division o residuo (modulo) es: {modulo}")
# el residuo de la division
 
print("")
 
exponente = operadorA ** operadorB
print(f"el resultado del exponente es: {exponente}")
 
# las 3 comillas hace q el resto del codigo no se reproduszca
 
print("")
num1 = int(input("escribe el alto del rectangulo: "))
num2 = int(input("escribe el ancho del rectangulo: "))
area = num1 * num2
perimetro = (num1 + num2) * 2
print("el area del rectangulo es: ", area)
print("el perimetro del rectangulo es: ", perimetro)
 
print("")
miVariable3 = 10
print(miVariable3)
 
# operadores de asignacion

miVariable3 = miVariable3 + 1
print(miVariable3)
# la variable se reduce o se resume
miVariable3 += 1
print(miVariable3)
 
# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)
 
# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)
 
# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# operadores de comparacion
d = 4
b = 6
resultado = d == b # comprobamos si son iguales\n'
print(resultado)
 
# operador diferente
resultado = d != b
print(resultado)
# operador mayor q
resultado = d > b
print(resultado)
# operador menor q
resultado = d < b
print(resultado)
# operador menor o igual q
 resultado = d <= b
 print(resultado)
# operador mayor o igual q
 resultado = d >= b
 print(resultado)
 print("")
 
 # numero par o impar
 
 num = int(input("ingrese un numero: "))
 num = num % 2 == 0
 
 if num:
     print("es par")
 else:
     print("es impar") # ejercicio hecho por mi pero me falto poner el residuo
 ---------------------------------------------
 a = int(input("digite un numero: "))
 print(f"el residuo de la division es: {a % 2}")
 if a % 2 == 0:
     print(f"el valor de a es: {a} es un numero PAR")
 else:
     print(f"el valor de a es: {a} es un numero IMPAR")

a = int(input("digite un numero: "))
print(f"degite un numero: {a}")
if a >= 18:
    print(f"es mayor de edad: {a} ")
else:
    print(f"es menor de edad: {a}")

--------------------------------------------------------

# operadores logicos
a = False
b = False
resultado = a and b
print(resultado)

# operador or
resultado = a or b
print(resultado)

# operador not
resultado = not a
print(resultado)

#ejercicio valor and
#valor dentro de un rango
valor = int(input("ingrese un numero: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"el valor {valor} esta dentro del rango")
else:
    print(f"el valor {valor} no esta dentro del rango")

# ejercicio valor or, operador not
vacaciones = False
diaDescanso = False
if not (vacaciones or diaDescanso):  # cambia el resultado de la logica el "not"
    print("tiene trabajo q hacer")
else:
    print("puede asistir al juego")


edad = int(input("ingrese su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    print("esta dentro del rango de los (20\'0) a (30\'0) años")
else:
    print("esta dentro del rango de los (20\'0) a (30\'0) años")

-------------------------------------------
'''
edad = int(input("ingrese su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte:  # if anidado
    print("esta dentro del rango de los (20\'0) años")
elif treinta:
    print("estas dentro del rango de los (30\'0) años")
else:
    print("esta dentro del rango de los (20\'0) a (30\'0) años")

# mayor de 2 numeros
num1 = int(input("ingrese el numero 1: "))
num2 = int(input("ingrese el numero 2: "))

if num1 > num2:
    print("el numero 1 es mayor")
else:
    print("el numero 2 es mayor")

# tienda de libros
libro = input("proporciona el nombre del libro: ")
ID = input("proporcione el ID del libro: ")
precio = int(input("digite el precio: "))
envioGratuito = precio >= 0 and precio <= 500

if envioGratuito:
    print("el envio es gratis")
else:
    print("el envio NO es gratis supera los $500")



















