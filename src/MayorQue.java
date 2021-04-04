
/**
 * Taller 8: 1. Mayor que...
 *
 * @author Mauricio David Correa H.
 * @version original 01. Date: 03.04.2021.
 */

public class MayorQue {
    public static void mayor(int[] a)
    {
        boolean existeMayor = false;
        for (int index = 0; index < a.length; index++)
        {
            if ( a[index] > a[0] )
            {
                existeMayor = true;
                System.out.println(a[index]);
            }
        }

        if (!existeMayor)
        {
            System.out.println("No hay ningun numero mayor que el primero");
        }
    }
}