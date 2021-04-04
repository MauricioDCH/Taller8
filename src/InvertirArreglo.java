public class InvertirArreglo {

    public static int[] invertir(int[] a)
    {
        int[] arrInv = new int[a.length];
        for (int index = 0; index < arrInv.length; index++)
        {
            arrInv[index] = a[(a.length-1)-index];
        }
        return arrInv;
    }

    public static void imprimir(int[] a)
    {
        for (int index = 0 ; index < a.length; index++)
        {
            if (index < (a.length-1))
            {
                System.out.print(a[index]+",");
            }
            else
            {
                System.out.print(a[index]);
            }
        }
    }
}
