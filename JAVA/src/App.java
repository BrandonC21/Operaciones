public class App {
    public static void main(String[] args) throws Exception {
       int[][] matriz = {
            {3, 4, 5},
            {1, 9, 5},
            {2, 8, 5}
       };
       int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
       };
       int[][] resultado = new int[3][3]; 

       for (int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz2[1].length; j++){  
                for(int k = 0; k < matriz2[1].length; k++){
                    resultado[i][j] += matriz[i][k] * matriz2 [k][j];
                }
           }
        }

        System.out.println("Resultado");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[1].length; j++) {
                System.out.printf(resultado[i][j] +"\t");
            }
            System.out.println();
        }
      
    }
}
