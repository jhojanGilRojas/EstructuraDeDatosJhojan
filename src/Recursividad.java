public class Recursividad {

    /*
    Escriba un método recursivo que retorne la matriz transpuesta de una matriz de
    tamaño mxn. La transpuesta de una matriz consiste en intercambiar las filas por las
    columnas. Ejemplo:
     */
    public static void main(String[] args) {

        int [][] matriz =
                {{1,3,5,7},
                {2,4,6,8},
                };

        int[][] matrizTraspuesta = hallarMatrizTraspuesta(matriz, new int[matriz[0].length][matriz.length],0,0);
        imprimirMatriz(matrizTraspuesta);
    }

    private static void imprimirMatriz(int[][] matrizTraspuesta) {

        for (int i = 0;i<matrizTraspuesta.length;i++){
            for (int j = 0; j<matrizTraspuesta[i].length;j++){
                System.out.print(matrizTraspuesta[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] hallarMatrizTraspuesta(int[][] matriz, int[][] matrizTraspuesta,int i , int j) {
        if (i == matriz.length && j == matriz[i].length){

        return matrizTraspuesta;
         }
        matrizTraspuesta [j][i] = matriz [i][j];

        if (i == matriz.length){
            return hallarMatrizTraspuesta(matriz,matrizTraspuesta,i=0,j+1);
        }
        else {
            return hallarMatrizTraspuesta(matriz,matrizTraspuesta,i+1,j=0);
        }
    }

}