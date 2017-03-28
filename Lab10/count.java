import java.io.*;
class count 
{
    public static void main (String args[])throws IOException
    {
        FileReader in =null;
        int wordCount =0, charCount=0, lineCount=0;
        try{
            in=new FileReader("/home/student/161610196/Lab10/src.txt");
            int ch;
            while((ch=in.read())!=-1)
            {
                charCount++;
                if (ch==' '||ch=='\n')
                wordCount++;
                if (ch=='\n')   
                lineCount++;

            }
            System.out.println("Words: "+wordCount);
            System.out.println("Char: "+charCount);
            System.out.println("Line: "+lineCount);
        }
        finally{
                if (in!=null) 
                in.close();
        }
    }
}
