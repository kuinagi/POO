void main(){

    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int contador = 1;

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            matriz[i][j] = contador++;
            System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    
    }