

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
class CsvUpdate
{
public static void main(String args[])
{ 
    
    String targetValue="raja";
    int column=2;
    String updatedValue="2028";
    if(csvFileUpdate(targetValue,updatedValue,column))
    {
        System.out.println("The file has  been updated");
    }
    else{
        System.out.println("data is not found");
    }
}
public static Boolean csvFileUpdate(String target,String updatedValue,int column)
{
    ArrayList<String> csv=new ArrayList<>();
    Boolean updated=false;
    try{
    BufferedReader breader=new BufferedReader(new FileReader("D://Raja//addresses.csv"));
    
    String line=breader.readLine();
    while(line!=null)
    {
        String[] row=line.split(",");
        if(row.length> column && row[0].equals(target))
        {
            row[column]=updatedValue;
            updated=true;
        }
            csv.add(String.join(",",row));
        line=breader.readLine();
    }
}catch(Exception e)
{
    updated=false;
    System.out.println("Something happens "+e);
}
if(updated)
{
try{
PrintWriter pwriter=new PrintWriter(new FileWriter("D://Raja//addresses.csv"));
for(String row:csv)
{
    pwriter.println(String.join(",",row));
}
pwriter.close();
}catch(Exception e)
{
    System.out.println("Something happens"+e);
    return false;
}
}    
    return updated;
}
}
