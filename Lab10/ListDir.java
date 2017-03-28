import java.io.*;
class ListDir {
    static void rList(String s)
    {
        File file = new File(s);
        if (file.isDirectory()){
            System.out.println(file.getName());
            String paths[]=file.list();
            for(int i=0; i<paths.length; i++)
            rList(s+"/"+paths[i]);

        }
        if(file.isFile())
        {
            System.out.println(file.getName());
        }
    }
    public static void main (String[] s)
    {
        String q="/home/student/161610196/Lab10";
        rList(q);

    }
}
