import java.util.Scanner;
import java.util.Arrays;
class Average
{
    public static void main(String args[])
    {
        int value=0;
        int[] arr={10,20,30,40};
        for(int i=0;i<arr.length;i++)
        {
             value+=arr[i];
        }
        int avg=value/arr.length;
        System.out.print("The average of the array is: "+ avg);
    }
}
    //---------------------------------------------------------------------------------------------
    class Addition
    {
        public static void main(String args[])
        {
        int[][] matrixA={{1,2},{3,4}};
        int[][] matrixB={{5,6},{7,8}};
        int[][] sum=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                sum[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));

    }
}
    //------------------------------------------------------------------------------------------------
class Multiplilcation
    {
        public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows=scan.nextInt();
        System.out.println("Enter the cols:");
        int cols=scan.nextInt();
        create ob=new create();
        int[][] matrixA=ob.makmat(rows,cols,scan);
        System.out.println("Enter the rows:");
        int row=scan.nextInt();
        System.out.println("Enter the cols:");
        int col=scan.nextInt();
        int[][] matrixB=ob.makmat(row,col,scan);
        int[][] mul=new int[rows][col];
        if(cols==row)
        {
        for(int i=0;i<rows;i++)
        {
           for(int j=0;j<col;j++)
           {
               for(int k=0;k<cols;k++)
               {
                  mul[i][j]+=matrixA[i][k]*matrixB[k][j];
               }
                   
           }
        }
       
        }
        else{
            System.out.println("These arrays are not multiplicable");
    }
        System.out.println(Arrays.deepToString(mul));
    }
}
    //---------------------------------------------------------------------------------------------
    class Transpose
    {
        public static void main(String args[])
    {
        
        int[][] matrix={{1,2},{3,4}};
        int[][] trans=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                trans[j][i]=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(trans));
    }
}
    //---------------------------------------------------------------------------------------------
class Maximum
{
    public static void main(String args[])
    {
    int[] arr={10,20,5,15};
    
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num<arr[i])
            {
                num=arr[i];
            }
        }
        System.out.println("The largest value in array: " + num);
    }
}

//--------------------------------------------------------------------------------------------------------
class Search
{
    public static void main(String args[])
{
    int element=3;
    int[][] arr={{1,2},{3,4}};
    for(int i=0;i<arr[0].length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(element==arr[i][j])
            {
                System.out.println("The position  is: ("+ i+","+j+")" );
            }
        }
    }
}
}

//*********************************************************************** */
class create
{
public static int[][] makmat(int a,int b, Scanner scan)
{
    int[][] arr=new int[a][b];
    System.out.println("Enter the elements: ");
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
        {
            arr[i][j]=scan.nextInt();
        }
    }
    return arr;
}
}
/*************************************************************************************************** */


class Merge
{
    public static void main(String args[])
    {
    int[] A={1,2,3};
    int[] B={4,5,6};
    int[] mer=new int[A.length+B.length];
    for(int i=0;i<A.length;i++)
    {
        mer[i]=A[i];
    }
    for(int i=0;i<B.length;i++)
    {
        mer[A.length+i]=B[i];
    }
    for(int num:mer)
    {
        System.out.print(num + " ");
    }
}
}
/***************************************************************************************** */
class odd
{
    public static void main(String args[])
    {
    int ecount=0,ocount=0;
    int[] A={1,2,3,4,5};
    for(int i=0;i<A.length;i++)
    {
        if(A[i]%2==0)
        {
            ecount++;
        }
        else
        {
            ocount++;
        }
    }
    System.out.println("Even= "+ecount);
    System.out.println("Odd="+ ocount);
}
}
/*********************************************************************************************************************************************** */

class Diagnal
    {
        public static void main(String args[])
        {
        int[][] A={{1,2},{3,4}};
        int sum=0;
        for(int i=0;i<A[0].length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(i==j)
                {
                    sum+=A[i][j];
                    break;
                }
            }
        }
        System.out.println("Sum of diagonal = " + sum);
    }
}

/********************************************************************* */
class Sumrow
{
    public static void main(String args[])
    {
        int[][] A={{1,2},{3,4}};
        int a=0;
        for(int i=0;i<A[0].length;i++)
        {
            int sum=0;
            for(int j=0;j<A.length;j++)
            {
                sum+=A[i][j];
                a=i+1;
            }
            System.out.println("The sum of "+ a+"row: "+ sum);
        }
    }
}
    /******************************************************************************* */
    class Spiral
    {
    public static void spiral(Scanner scan)
    {
        
        System.out.println("Enter the rows:");
        int rows=scan.nextInt();
        System.out.println("Enter the cols:");
        int cols=scan.nextInt();
        create ob=new create();
        int[][] arr=ob.makmat(rows,cols,scan);
        int rs=0,re=rows-1,cs=0,ce=cols-1;
        while(rs<=re&&cs<=ce)
        {
            for(int i=cs;i<=ce;i++)
            {
                System.out.print(arr[rs][i]+ " ");
            }
            rs++;
            for(int i=rs;i<=re;i++)
            {
                System.out.print(arr[i][ce]+" ");
            }
            ce--;
            if(rs<=re);
            {
            for(int i=ce;i>=cs;i--)
            {
                System.out.print(arr[re][i]+ " ");
            }
        }
            re--;
            if(cs<=ce)
            {
                for(int i=re;i>=rs;i--)
                {
                    System.out.print(arr[i][cs]+ " ");
                }

            }
            cs++;
        }
    }
}
    /*************************************************************************************************/
    class Reverse
    {
        public static void main(String args[])
    {
        System.out.println("Enter the rows:");
        Scanner scan=new Scanner(System.in);
        int rows=scan.nextInt();
        System.out.println("Enter the cols:");
        int cols=scan.nextInt();
        create ob=new create();
        int[][] arr=ob.makmat(rows,cols,scan);
        int[][] rev=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            int n=rows,m=cols;
            for(int j=0;j<cols;j++)
            {
                rev[i][j]=arr[n-1-i][m-1-j];
            }
        }
        System.out.println("The Reverse matrix: "+ Arrays.deepToString(rev));
    }
}
    /*******************************************************************************************/
class Rotate
    {
        public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows=scan.nextInt();
        System.out.println("Enter the cols:");
        int cols=scan.nextInt();
        create ob=new create();
        int[][] arr=ob.makmat(rows,cols,scan);
        int[][] rot=new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                rot[i][j]=arr[rows-1-j][i];
            }
        }
        System.out.println("The Rotate matrix: "+ Arrays.deepToString(rot));
    }
   

    }
    




