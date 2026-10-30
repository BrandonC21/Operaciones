#include <stdio.h>

int main()
{
    int matriz1[3][3] ={
        {3, 4, 5},
        {1, 9, 5},
        {2, 8, 5}
    };
    int matriz2[3][3] ={
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int resultado[3][3] = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
           for(int k = 0; k <3; k++){
               resultado[i][j] += matriz1[i][k] * matriz2[k][j];
           }
        }
    }
    printf("Resultado")
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
           printf("%d \t", resultado[i][j]);
        }
        printf("\n");
    }

    return 0;
}