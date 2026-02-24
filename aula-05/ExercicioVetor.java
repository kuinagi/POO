void main(){

    //vetor de 100 posições iniciem ele com impares começando com 3



    int[] vetor = new int[100];

    vetor[0] = 3;
    
    for (int i = 1; i < vetor.length; i++) {
        vetor[i] = vetor[i-1] + 2;
        }
  
}