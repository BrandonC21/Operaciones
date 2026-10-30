mat1 = [
    [3, 4, 5],
    [1, 9, 5],
    [2, 8, 5]
]

mat2 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

resultado = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]


for i in range(len(mat1)):
    for j in range(len(mat2[0])):
        for k in range(len(mat2)):
            resultado[i][j] += mat1[i][k] * mat2[k][j]

print("Resultado:")
for fila in resultado:
    print(fila)
