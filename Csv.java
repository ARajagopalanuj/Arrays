
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
class Csv
{
    public static void main(String args[])
    {
        Csv cs=new Csv();
       /* cs.csvWrite();
        * cs.csvRead();
        cs.found();
       */
    }
    public void csvRead()
    {
        int count=0;
        int ccount=0;
        try{
        FileReader freader=new FileReader("D://Raja//addresses.csv");
        BufferedReader breader=new BufferedReader(freader);
        String line=breader.readLine();
        String[]words=line.split(",");
        for(String word:words)
          {
              ccount++;  
        }
        while(line!=null)
        {
            count++;
            System.out.println(line);
            line=breader.readLine();
        }
        breader.close();
    
        System.out.println(" row count" +count);
        System.out.println("column count"+ ccount);
    }catch(Exception e)
    {
        System.out.println("Something errors"+e);
    }

    }
    public void csvWrite(){
        try{
        FileWriter fwriter=new FileWriter("D://Raja//addresses.csv",true);
        PrintWriter pwriter=new PrintWriter(fwriter);
        pwriter.println("Name,Age,Year");
        pwriter.println("raja,25,2000");
        pwriter.println("udhaya,22,2002");
        pwriter.flush();
        pwriter.close();
        System.out.println("Succesfully added");      
        }catch(Exception e)
        {
            System.out.println("Something happends "+e);
        }
    }
   public void found(){
        try{
        FileReader freader=new FileReader("D://Raja//addresses.csv");
        BufferedReader breader=new BufferedReader(freader);
        String line=breader.readLine();
        while(line!=null)
        {
            String[]words=line.split(",");
            for(String word:words)
              {
                if(word.equals("raja"))
                {
                System.out.println(line);
                }
            }
            line=breader.readLine();
        }

    }catch(Exception e)
    {
        System.out.println("Something Happens"+e);
    }
}
}
