import java.util.Scanner;
class Functions
{
    public int factorial(int n)
    {
        int fact;
        if(n==0||n==1)
        {
            return 1;
        }
        return n*(factorial(n-1));
        
    }
    public void prime(int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not prime");
        }
    }
    public void fibonacci(int n)
    {
        int[]arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=1;i<n-1;i++)
        {
            arr[i+1]=arr[i]+arr[i-1];
        }
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
    public void sum(int n)
    {
        int num;
        int value=0;
        while(n>0)
        {
         num=n%10;
        value+=num;
        n=n/10;
        }
        System.out.println("The sum of the number is: " + value);
    }
    public void palindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<=n;i++)
        {
            if(i==n)
            {
                System.out.println("The given string "+s+" is palindrome");
                break;
            }
            else if(s.charAt(i)==s.charAt(n-1-i))
            {
                continue;
            }
            else{
                System.out.println("The String "+ s + " is not palindrome");
                break;
            }  
        }     
    }
    public int gcd(int m,int n)
    {
        int a=m;
        int b=n;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public void lcm(int a,int b)
    {
        int n=gcd(a,b);
        int value=(a*b)/n;
        System.out.println("The LCM value is: "+ value);
    }
    public void armstrong(int n)
    {
        int original_value=n;
        int value=0;
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            count++;
        }
        n=original_value;
        while(n>0)
        {
            int a=1;
            int rem=n%10;
            for(int i=0;i<count;i++)
            {
                a*=rem;
            }
            value+=a;
            n=n/10;            
        }
        if(original_value==value)
        {
            System.out.println( original_value +"the given number is Armstrong");
        }
        else{
            System.out.println( original_value +"the given number is not Armstrong");
        }
    }

    
    public void factor(int n)
    {
        System.out.print("The factors: "); 
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.print("The number of factors: "+ count);
    }
    public void perfect(int n)
    {
        int value=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                value+=i;
            }
        }
        if(value==n)
        {
            System.out.println("The given number "+n+" is perfect");
        }
        else{
            System.out.println("The given number "+n+" is not perfect");
        }
    }
    public void power(int a,int b)
    {
        int value=a;
        if(b>0)
        {
            
        for(int i=1;i<b;i++)
        {
            value*=a;
        }
        System.out.println("The power value is "+ value);
    }
    else if(b==0)
    {
        System.out.println("The power value is 1" ); 
    }
    }
    public void digrev(int n)
    {
        int rem;
        String value="";
        while(n>0)
        {
            rem=n%10;
            value+=rem;
            n=n/10;
        }

        System.out.println("The Reversed number: " + value);
    }
    public static void main(String args[])
    {
        System.out.println(" Factorial choose 1\n Prime choose 2\n Fibonacci choose 3\n sum of digits choose 4\nPalindrome checker choose 5\n GCD choose 6\nLCM choose 7\n Armstrong Choose 8\nFactor count choose 9\n Perfect number choose 10\n power functionchoose 11\n Digit Reverser choose 12");
        Scanner scan=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int choice =scan.nextInt();
        Functions obj=new Functions();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the number");
            int fact=scan.nextInt();
           int a=obj.factorial(fact);
           System.out.print("The factorial of "+a);
           break;
           case 2:
           System.out.println("Enter the num");
           int b=scan.nextInt();
           obj.prime(b);
           break;
           case 3:
           System.out.println("Enter the num");
           int c=scan.nextInt();
           obj.fibonacci(c);
           break;
           case 4:
           System.out.println("Enter the num");
           int d=scan.nextInt();
           obj.sum(d);
           break;
           case 5: 
           System.out.println("Enter the String");
           String s1=sc.nextLine();
           obj.palindrome(s1);
           break;
           case 6:
           System.out.println("Enter the num1");
           int gnum1=scan.nextInt();
           System.out.println("Enter the num2");
           int gnum2=scan.nextInt();
           int gnum=obj.gcd(gnum1,gnum2);
           System.out.println("The GCD value is: "+ gnum);
           break;
           case 7:
           System.out.println("Enter the num1");
           int lnum1=scan.nextInt();
           System.out.println("Enter the num2");
           int lnum2=scan.nextInt();
           obj.lcm(lnum1,lnum2);
           break;
           case 8:
           System.out.println("Enter the num");
           int e=scan.nextInt();
           obj.armstrong(e);
           break;
           case 9:
           System.out.println("Enter the num");
           int f=scan.nextInt();
           obj.factor(f);
           break;
           case 10:
           System.out.println("Enter the num");
           int g=scan.nextInt();
           obj.perfect(g);
           break;
           case 11:
           System.out.println("Enter the num1");
           int base=scan.nextInt();
           System.out.println("Enter the num2");
           int exp=scan.nextInt();
           obj.power(base,exp);
           break;
           case 12:
           System.out.println("Enter the num");
           int z=scan.nextInt();
           obj.digrev(z);
           break;
           default :
           System.out.println("Invalid syntax");
        }
    }
}