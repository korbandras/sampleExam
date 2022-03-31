import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> indexesOfNullColumns(int[][] matric)
    {
        ArrayList<Integer> dik = new ArrayList<>();
        for(int i = 0; i < matric.length; i++)
        {
            if(matric[0][i] == 0)
            {
                dik.add(i);
            }
        }
        return dik;
    }
    public static int[] indexOfMaximum (int[][] matric)
    {
        int[] array = new int[2];
        ArrayList<Integer> all = new ArrayList<>();
        for(int i = 0; i < matric.length; i++)
        {
            /*for (int elem :
                    matric[i]) {
                all.add(elem);
            }*/
            for(int j = 0; j < matric[i].length; j++)
            {
               all.add(matric[i][j]);
            }
        }
        int maximum = all.get(0);
        for(int i = 1; i<all.size(); i++)
        {
            if(maximum < all.get(i)) maximum = all.get(i);
        }
        outerloop:
        for(int i = 0; i < matric.length; i++)
        {
            for (int j = 0; j < matric[i].length; j++)
            {
                if(matric[i][j] == maximum)
                {
                    array[0] = i;
                    array[1] = j;
                    //i = matric.length -1;
                    //j = matric[i].length -1;
                    break outerloop;
                }
            }
        }
        return array;
    }
}
