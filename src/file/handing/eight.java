
package file.handing;
import java.io.*;

public class eight {
    
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("office.txt");
        DataInputStream dis=new DataInputStream(fis);
        int x=dis.readInt();
        double d=dis.readDouble();
        boolean b=dis.readBoolean();
        char ch=dis.readChar();
        System.out.println("the int is "+x);
         System.out.println("the double is "+d);
          System.out.println("the boolean is "+b);
           System.out.println("the char is "+ch);
          
    }
}
