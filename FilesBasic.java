import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
class FilesBasic{
   /* createFile()
    writefile()
    ReadFile()
    deleteFile()
    copyFile()
    Userinput()
    searchWord()*/
    public static void main(String args[])   
    {
        FilesBasic f=new FilesBasic();
        f.countwords();
      
    }
    //Create File
        public void createFile()
        {
        try{
        File file=new File("D:\\Raja\\Text.txt");
        boolean check=file.exists();
        if(!check)
        {
            file.createNewFile();
            System.out.println("File Successfully created");
        }
        else
        {
            System.out.println("File is already exists");
        }
    }catch(Exception e)
    {
        System.out.println("Something happens" +e);
    }
}
//Write File
public void writefile(){
    try{
    File file=new File("D:\\Raja\\Text.txt");
    FileWriter fwriter=new FileWriter(file,true);
    fwriter.write("Hello world!");
    System.out.println("Successfully written");
    fwriter.flush();
    fwriter.close();
    }catch(Exception c){
        System.out.println("Something is error" + c);
    }
}
//readFile and count lines
public void ReadFile(){
    int count=0;
    try{
    File file=new File("D:\\Raja\\Text.txt");
    FileReader freader=new FileReader(file);
    BufferedReader breader=new BufferedReader(freader);
    String line=breader.readLine();
    while(line!=null){
        count++;
        System.out.println(line);
        line=breader.readLine();
    }
    System.out.println("Number of lines: "+count);
    breader.close();
    }catch(Exception e)
    {
        System.out.println("Something happends"+e);
    }
}
//DeleteFile
public void deleteFile(){
    try{
    File file=new File("D:\\Raja\\Text.txt");
    boolean check=file.exists();
    if(check)
    {
        file.delete();
        System.out.println("File Successfully deleted");
    }
    else
    {
        System.out.println("File is already deleted");
    }
    }catch(Exception e)
    {
        System.out.println("Something happens"+e);
    }

}
//Copy file
public void copyFile()
{
    try{
    File file=new File("D:\\Raja\\Text.txt");
    FileReader freader=new FileReader(file);
    BufferedReader breader=new BufferedReader(freader);
    File files=new File("D:\\Raja\\copy.txt");
    FileWriter fwriter=new FileWriter(files,true);
    BufferedWriter bwriter=new BufferedWriter(fwriter);
    String line=breader.readLine();
    while(line!=null){
        bwriter.write(line);
        line=breader.readLine();
    }
    System.out.println("Copying succesfully");
    breader.close();
    }catch(Exception e)
    {
        System.out.println("Something happends"+e);
    }
}
//User input
public void Userinput(){
    Scanner scan=new Scanner(System.in);
    try{
    File files=new File("D:\\Raja\\copy.txt");
    FileWriter fwriter=new FileWriter(files,true);
    BufferedWriter bwriter=new BufferedWriter(fwriter);
    System.out.println("Enter the line");
    System.out.println("Enter the last line input finish");
    String s=scan.nextLine();
    Boolean condition=true;
    while(condition)
    {
    bwriter.newLine();
    bwriter.write(s);
    bwriter.flush();
    s=scan.nextLine();

    if(s.equals("finish"))
    condition=false;
    }
    bwriter.close();
    System.out.println("givenlines are Succesfully added");    
    }catch(Exception e)
    {
        System.out.println("Something error "+e);
    }

}
public void searchWord(){
    Scanner scan=new Scanner(System.in);
    int count=0;
    try{
    File files=new File("D:\\Raja\\copy.txt");
    FileReader freader=new FileReader(files);
    BufferedReader breader=new BufferedReader(freader);
    String line=breader.readLine();
    while(line!=null)
    {
        String[] words=line.split(" ");
        count++;
        for(String word:words)
        {
            if(word.equals("raja"))
            System.out.println("word found in line "+ count);
            break;
        }
        line=breader.readLine();
    }
}catch(Exception e)
{
    System.out.println("Something errors "+e);
}
}
public void countwords(){
        Scanner scan=new Scanner(System.in);
        int count=0;
        try{
        File files=new File("D:\\Raja\\copy.txt");
        FileReader freader=new FileReader(files);
        BufferedReader breader=new BufferedReader(freader);
        String line=breader.readLine();
        while(line!=null)
        {
            String[] words=line.split(" ");
            
            for(String word:words)
            {
                count++;
            }
            line=breader.readLine();
        }
        System.out.println("Number of words" +count);
    }catch(Exception e)
    {
        System.out.println("Something errors "+e);
    }
    }
}

