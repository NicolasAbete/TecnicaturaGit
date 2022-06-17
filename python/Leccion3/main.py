# ciclo while (mientras o durante)
'''
contador = 0
while contador < 78:
    print("ejecutamos nuestro ciclo while",contador)
    contador += 1
else:
    print ("fin del ciclo while")

# imprimir numeros del 0 al 5 en el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1


minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
'''
# ciclo for (nos permite iterar una lista de elementos "PARA")
# recorre una cantidad  determinada de datos
cadena = "hello"
for letra in cadena:
    print(letra)
else:
    print("fin del ciclo for")
# tambien comnocido como for-each

# palabra reservada BREAK
for letra in "alemania":
    if letra == "a":
        print(f"letra encontrada: {letra}")
        break # BREAK rompe el ciclo de la estructura
else:
    print("fin del ciclo for")

# palabra reservada CONTINUE
for i in range(6): # range se refiere al rango entre numeros
    if i % 2 == 0:
        print(f"valor: {i}")

for i in range(6):
    if i % 2 != 0:
        continue # CONTINUE anula o salta de una iteracion a la siguiente, en este caso todos los numeros impares
    print (f"valor: {i}")
































