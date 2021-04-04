public class Balanceado {
    public static boolean balancear(int[] a)
    {
//        boolean balanceado = false;
//        int sum1 = 0, sum2 = 0;
//        for (int index = 0; index < a.length; index++)
//        {
//            // Sumar la primer mitad.
//            if (index < (a.length/2))
//            {
//                sum1 += a[index];
//            }
//            // Sumar la segunda mitad.
//            else if (index > (a.length/2))
//            {
//                sum2 += a[index];
//            }
//        }
//
//        if (sum1 == sum2)
//        {
//            balanceado = true;
//        }
//        return balanceado;

        int sum1 = 0, sum2 = 0;
        for (int index = 0; index < (a.length/2); index++)
        {
            // Sumar la primer mitad.
                sum1 += a[index];

            // Sumar la segunda mitad.
                sum2 += a[(a.length-1)-index];
        }
        return sum1 == sum2;
    }
}