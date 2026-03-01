# Crear matriz 5x5
matriz = []

# Ingreso de datos
for fila in range(5):
    fila_datos = []
    for columna in range(5):
        numero = int(input(f"Ingrese número [{fila}][{columna}]: "))
        fila_datos.append(numero)
    matriz.append(fila_datos)

# Mostrar matriz
print("\nMatriz ingresada:")
for fila in matriz:
    for valor in fila:
        print(valor, end="\t")
    print()
