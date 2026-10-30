int[,] mat ={
    {3, 4, 5},
    {1, 9, 5},
    {2, 8, 5}
};
int[,] mat2 ={
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[,] resultado = new int[3, 3];

for (int i = 0; i < mat.GetLength(0); i++){
    for(int j = 0; j < mat2.GetLength(1); j++){
        for(int r = 0; r < mat2.GetLength(1); r++){
            resultado[i, j] += mat[i, r] * mat2[r, j];
        }
    }
    
}

Console.WriteLine("Resultado");
for(int i = 0; i < resultado.GetLength(0); i++){
    for(int j = 0; j < resultado.GetLength(1); j++){
        Console.WriteLine(resultado[i,j] + " ");
    }
    Console.WriteLine(" ");
}




