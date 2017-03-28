import java.io.*;
public class CharCopyFile
{
    public static void main(String[] args)throws IOException
    {
            FileReader fin=null;
            FileWriter fout=null;
            try {
                fin=new FileReader("/home/student/161610196/Lab10/src.txt");
                fout=new FileWriter("/home/student/161610196/Lab10/dest.txt");
                //int filesize =fin.available();
                //System.out.println("File Size in bytes: "+filesize);
                int ch;
                while((ch=fin.read()) > 0){
                        fout.write(ch);
                }
                System.out.println("File copied  Succesfully");
            }
            finally{
                    fin.close();
                    fout.close();
            }

    }


}
