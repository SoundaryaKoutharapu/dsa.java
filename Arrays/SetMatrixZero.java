public class SetMatrixZero 
{
    public static void setZeroes(int[][] a) 
    {
        int var = 1;
        int row = a.length;
        int col = a[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(a[i][j]==0)
                {
                    a[i][0] = 0;
                    if(j!=0)
                    {
                        a[0][j] = 0;
                    } 
                    else
                    var = 0;   
                }
            }
        }

        for(int i=1; i<row; i++)
        {
            for(int j=1; j<col; j++)
            {
                if( a[i][j] != 0 &&  a[i][0] == 0 || a[0][j] == 0)
                {
                    a[i][j] =0;
                }
            }
        }


        if(a[0][0]==0)
        {
            for(int j=0; j<col; j++)
            {
                a[0][j]=0;
            }
        }


         if(var==0)
        {
            for(int i=0; i<row; i++)
            {
                a[i][0]=0;
            }
        }

    }


    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {3, 0, 5, 2},
            {0, 10, 11, 12},
            {1, 3, 1, 0}
        };

            setZeroes(matrix);
        
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}