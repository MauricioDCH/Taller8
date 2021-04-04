
/**
 * Taller 8: 2. Arreglo con mala suerte
 *
 * @author Mauricio David Correa H.
 * @version original 01. Date: 03.04.2021.
 */

public class Sortario {
    public static boolean detectorDeMalaSuerte(int[] a)
    {
        boolean esUno = false;
        boolean esTres = false;
        boolean esTrece = false;

        boolean tieneMalaSuerte = false;

        for (int index = 0; index < a.length; index++)
        {
            if (a[index] == 1)
            {
                esUno = true;
            }
            else if (a[index] == 3)
            {
                esTres = true;
            }
            else if (a[index] == 13)
            {
                esTrece = true;
            }
        }

        if (((esUno)&&(esTres))||(esTrece))
        {
            tieneMalaSuerte = true;
        }
        return tieneMalaSuerte;
    }
}