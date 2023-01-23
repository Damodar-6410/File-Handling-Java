
package file.handing;
import java.io.*;
public class third {
    public static void main(String[] args) {
      File f=new File("alpha.txt");
      long val=f.lastModified();
     // java.util.Date dt=new java.util.Date(val);
        java.sql.Date dt=new java.sql.Date(val);
       System.out.println(val);
         System.out.println(dt);
        }
    }
