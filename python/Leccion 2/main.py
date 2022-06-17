# en esta clase veremos la sentencia if/else
'''
condicion = False
if condicion:
    print("condicion verdadera")
else:
    print("condicion falsa")
# ---------------------------------------------
condicion = '' # la condicion esta vacia por lo tanto es falsa
if condicion:
    print("condicion verdadera")
else:
    print("condicion falsa")

# -------------------------------------------------
condicion = 10
if condicion == True:
    print("condicion verdadera")
elif condicion == False:
    print('condoicion falsa')
else:
    print("condicion sin especificar")
# detecta automaticamente si la variable es un dato de tipo entero o caracter o booleano

# ---------------------------------------------
num = int(input("digite un numero en el rango del 1 al 3: "))
numTexto = ''
if num == 1:
    numTexto = "numero uno"
elif num == 2:
    numTexto = "numero dos"
elif num == 3:
    numTexto = "numero tres"
else:
    numTexto = "has ingresado un numero fuera de rango"

print(f"el numero ingresado es: {num} - {numTexto}")
# ----------------------------------------------------
'''
condicion = True
# if condicion: ----- para hacer qtodo quede en comentario se puede tambien seleccionar el texto y se pulsa Ctrl + /
#     print("condicion verdadera")
# else:
#     print("condicion falsa")

print("condicion falsa") if condicion else print("condicion verdadera")
# operador ternario
# solo es necesario si la variable es muy pequeña

















