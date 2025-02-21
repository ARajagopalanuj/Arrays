
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class Propts{
    public static void main(String args[])
    {

    }
}

class BasicProp
{
public static void main(String args[])
{
Properties pr=new Properties();
try{
FileOutputStream fos=new FileOutputStream("D://Raja//config.properties");
pr.setProperty("theme","dark");
pr.setProperty("Language","English");
pr.store(fos,"Success");
System.out.println("Preferences Saved Succesfully");
}catch(Exception e)
{
    System.out.println("Something happends"+e);
}

}
}

class Basic2{
public static void main(String args[])
{
    Properties pr=new Properties();
    try{
        FileOutputStream fos=new FileOutputStream("D://Raja//config.properties");
        pr.setProperty("theme","dark");
        pr.setProperty("Language","English");
        pr.store(fos,"Success");
        System.out.println("Preferences Saved Succesfully");
        FileInputStream fis=new FileInputStream("D://Raja//config.properties");
        pr.load(fis);
        System.out.println("Theme " +pr.getProperty("theme"));
        System.out.println("Language " +pr.getProperty("Language"));
        }catch(Exception e)
        {
            System.out.println("Something happends"+e);
    }
}
}
class Change
{
public static void main(String args[])
{
    Properties pr=new Properties();
    try{
        FileOutputStream fos=new FileOutputStream("D://Raja//config.properties");
        pr.setProperty("theme","dark");
        pr.setProperty("Language","English");
        pr.store(fos,"Success");
        pr.setProperty("theme","light");
        pr.store(fos,"updated");
        System.out.println("Preferences Saved Succesfully");
        FileInputStream fis=new FileInputStream("D://Raja//config.properties");
        pr.load(fis);
        System.out.println("Theme " +pr.getProperty("theme"));
        System.out.println("Language " +pr.getProperty("Language"));
        }catch(Exception e)
        {
            System.out.println("Something happends"+e);
    }
}
}

class FindKey{
public static void main(String args[])
{
    Properties pr=new Properties();
    try{
        FileOutputStream fos=new FileOutputStream("D://Raja//config.properties");
        pr.setProperty("theme","dark");
        pr.setProperty("Language","English");
        pr.store(fos,"Success");
       if(pr.containsKey("fontsize"))
       {
        System.out.println("is Available");
       }
       else{
        System.out.println("The key is not found");
       }
        }catch(Exception e)
        {
            System.out.println("Something happends"+e);
    }
}
}
class delkey
{
public static void main(String args[])
{
    Properties pr=new Properties();
    try{
        FileOutputStream fos=new FileOutputStream("D://Raja//config.properties");
        pr.setProperty("theme","dark");
        pr.setProperty("Language","English");
        pr.store(fos,"Success");
        if (pr.containsKey("theme")) {
        pr.remove("theme");    
        System.out.println("Removed Succesfully"); 
        pr.store(fos,"updated");
        fos.close();
        }
        FileInputStream fis=new FileInputStream("D://Raja//config.properties");
        pr.load(fis);
        fis.close();
        }catch(Exception e)
        {
            System.out.println("Something happends"+e);
    }
}
}

