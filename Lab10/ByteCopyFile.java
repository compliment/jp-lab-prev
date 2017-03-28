import java.io.*;
public class ByteCopyFile
{
    public static void main(String[] args)throws IOException
    {
            FileInputStream fin=null;
            FileOutputStream fout=null;
            try {
                fin=new FileInputStream("/home/student/161610196/Lab10/src.txt");
                fout=new FileOutputStream("/home/student/161610196/Lab10/dest.txt");
                int filesize =fin.available();
                System.out.println("File Size in bytes: "+filesize);
                int ch;
                while((ch=fin.read())!=-1){
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
