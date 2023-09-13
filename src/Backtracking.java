public class Backtracking {


    public char[][] mapa =
            {
            {' ', ' ', ' ', ' ', ' ', '1', ' ', ' '},
            {' ', '1', '1', ' ', '1', '1', ' ', '1'},
            {' ', ' ', '1', ' ', ' ', ' ', ' ', ' '},
            {'1', ' ', ' ', ' ', ' ', '1', '1', '1'},
            {'1', ' ', '1', '1', ' ', '1', '1', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'1', ' ', '1', ' ', '1', '1', ' ', '1'},
            };
    public static void main(String[] args) {
       Backtracking mapaCiudad = new Backtracking ();
        mapaCiudad.mapa[6][6] = 'S';
        mapaCiudad.resuelve(0, 0);
        System.out.println(mapaCiudad.imprimirLaberinto(0,0));

    }

    private void resuelve(int x, int y) {
        if(paso(x,y)){
          mapa[x][y]='E';
        }

    }

    private boolean paso(int x, int y) {

        if (x<0||y<0||x>mapa.length-1||y>mapa[x].length-1||mapa[x][y] == '1'||mapa[x][y] == '0'){
            return  false;
        }

        if (mapa[x][y]=='S'||mapa[x][y]=='E'){
            return true;
        }

       mapa[x][y]= '0';

        boolean result;

        result = paso(x,y+1);
        if(result) return true;

        result = paso(x+1,y);
        if (result) return true;

        result = paso(x,y-1);
        if (result) return true;

        result = paso(x-1,y);
        if (result) return true;

         mapa [x][y]  = 'f';
         return false;
    }

    private String imprimirLaberinto(int x, int y) {


        String salida = "";


        if( x < mapa.length )
        {
            if(y < mapa[x].length)
            {
                salida += mapa[x][y] + " ";
                return salida + imprimirLaberinto(x, y+1);
            }
            else
            {
                salida += "\n";
                y = 0;
                return salida + imprimirLaberinto(x+1, y);
            }
        }
        else
        {
            return salida;
        }
    }
}
