/*
One-Maximum
Two-Minimum
Three-Average
Four-odd even
Five-Second largest value
Six-Sum
Seven -Merge
Eight-Sort
Nine- Frequency
Ten -Duplicate
class  One*/
import java.util.Scanner;
class Arrayex
{
    public static void main(String args[])
    {

    }
}

    class One
    {
     public static void main(String args[])
    {
        int[] array={3,5,1,9};
        int maximum=0;
        for(int i=0;i<array.length;i++)
        {
            if(maximum<array[i])
            {
                maximum=array[i];
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}
class  Two
{
    public static void main(String args[])
    {
        int[] array={7,2,10,4};
        int minimum=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(minimum>array[i])
            {
                minimum=array[i];
            }
        }
        System.out.println("Minimum: " + minimum);
    }
}
class Three
{
    public static void main(String args[])
    {
        int[] array={3,5,7,9,8,6,4,2,};
        int total=0;
        int count=0;
        for(int i=0;i<array.length;i++)
        {
           total+=array[i];
           count++;
        }
        total=total/count;
        System.out.println("Average: " + total);
    }
}
class Four
{
    public static void main(String args[])
    {
         int[] array={2,3,4,5,6};
         int num;
         int count=0;
         int count1=0;
         for(int i=0;i<array.length;i++)
         {
            num=array[i];
            if(num%2==0)
            {
                count++;
            }
            else{
                count1++;
            }
         }
         System.out.println("Even = "+count);
         System.out.println("Odd = "+count1);
    }
}
class Five
{
     public static void main(String args[])
    {
        int[] array={12,35,1,10,34};
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                }
            }
        }
        System.out.println("Second largest value: " +array[n-2]);
    }
}
class Six
{
    public static void main(String args[])
    {
        int[]array={2,4,6,8,10};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
        if(i%2==0)
        {
            sum+=array[i];
        }
        }
        System.out.println("Sum = "+sum);
    }
}
class Seven
{
    public static void main(String args[])
    {
        int[]arr={1,3,5};
        int[]arr1={2,4,6};
        int n=arr.length+arr1.length;
        int[]newarr=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i<arr.length)
            {
            newarr[i]=arr[i];
            }
            else{
            newarr[i]=arr1[i-arr.length];
            }
        }
        for(int num:newarr)
        {
            System.out.print(num + " ");
        }
    }
}
class Eight
{
    public static void main(String args[])
    {
        int[]arr={3,1,4,2};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr)
        {
        System.out.print(num + " ");
        }
    }
}
class Nine
{
    public static void main(String args[])
    {
        
        System.out.println("Enter the terms of array");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int[] c=new int[n];
         System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();            
        }
      
        for(int i=0;i<n;i++)
        {
            if(c[i]==1)
            {
                continue;
            }
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    c[j]=1;
                }
            }

            System.out.println(arr[i] + " " +count);
        }
    }
}

  class Ten
{
    public static void main(String args[])
    {
        
        System.out.println("Enter the terms of array");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int[] c=new int[n];
         System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();            
        }
      int count=0;
        for(int i=0;i<n;i++)
        {
            if(c[i]==1)
            {
                continue;
            }
            
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c[j]=1;
                    count++;
                }
                
                 
            }
              System.out.print(arr[i]+ " ");   
        }
        
    }
}