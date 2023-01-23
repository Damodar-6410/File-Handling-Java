
package file.handing;
import java.util.*;
import java.io.*;
public class fifth {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
      //  FileOutputStream fos=new FileOutputStream("Info.txt");
       FileOutputStream fos=new FileOutputStream("Info.txt",true);
        System.out.println("enetr a string");
        String s=sc.next();
        byte b[]=s.getBytes();
      // byte b[]={65,66,67,68,69};
       // fos.write(b);
       fos.write(b, 0, 3);
        /* fos.write(65);
         fos.write(66);
         fos.write(67);
         fos.write(68);
         fos.write(69);
         fos.write(70);
         fos.write(71);*/
         fos.close();
         System.out.println("file created");
         
}
}