package IO;
import java.io.*;
class MyFileWriter{
    public static void main(String s1[])throws IOException {
        // FileOutputStream fw=new FileOutputStream("Lalu.txt");//write Mode        
        FileOutputStream fw=new FileOutputStream("Lalu.txt",true);//Append Mode        
        //FileOutputStream fw=new FileOutputStream("e:\\F2Lalu.txt");//write Mode        
        //FileOutputStream fw=new FileOutputStream("e:\\F2Lalu.txt");//write Mode        
        String s="india is a good country in the world sfjdsflsdfjsldjfsldfjldf";
        byte ch[]=s.getBytes();
        // fw.write(ch);
        for(int i=0;i<ch.length;i++)
        {
            fw.write(ch[i]);
            fw.close();
            System.out.println("file created succesfully");
        }
    }
}
class MyFileReader{
    public static void main(String s1[])throws IOException {
        FileInputStream fr=new FileInputStream("Lalu.txt");
        // FileInputStream fr=new FileInputStream("Lalu.txt");
        int i=0;
        while ((i=fr.read())!=-1) {
            System.out.println((char)i);
            fr.close();
        }
    }
}
class MyFileReader1{
    public static void main(String s1[] )throws IOException {
        FileInputStream fr=new FileInputStream("Lalu.txt");
        byte b[]=new byte[fr.available()];
        fr.read(b);
        String s=new String(b);
        System.out.println(s);
    }
}