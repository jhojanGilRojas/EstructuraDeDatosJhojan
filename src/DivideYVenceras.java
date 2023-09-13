public class DivideYVenceras {
    public static void main(String[] args) {

        int [] arreglo = {1,2,0,4,5,7,2,1};
        System.out.println( verificarMayor(arreglo,0,arreglo.length-1,0));
    }

/*
Este metodo halla el mayor de un arreglo ultilizando el metodo de programación recursivo Divide y venceras
 */
    private static int verificarMayor(int[] arreglo, int inicio, int fin,int acum) {

        if (inicio==fin){
            if (acum>arreglo[fin]){
                return acum;
            }
            return acum;
        }
        int mitad = (inicio+fin)/2;
        int ladoIzquierdo = verificarMayor(arreglo,inicio,mitad,arreglo[inicio]);
        int ladoDerecho = verificarMayor(arreglo,mitad+1,fin,arreglo[mitad+1]);

        if (ladoDerecho>ladoIzquierdo){
            return ladoDerecho;
        }else
        {
            return ladoIzquierdo;
        }
    }
}
