
package file.handing;

import java.io.*;
public class fourth {
    public static void main(String[] args) {
        //File f=new File("dummy\\tummy\\mummy");
       // File f=new File("dummy\\tummy");
       File f=new File("dummy");
               // boolean b=f.mkdir();
               boolean b=f.delete();
                System.out.println(b);
    }
}
