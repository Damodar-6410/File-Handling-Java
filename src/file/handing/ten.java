
package file.handing;

import java.io.*;
public class ten {
    public static void main(String[] args) throws Exception{
        emp e1=new emp(111,"AAA",36890);
        emp e2=new emp(222,"bbb",46245);
        emp e3=new emp(352,"cccc",2323);
        emp e4=new emp(33,"ddd",88890);
        FileOutputStream fos=new FileOutputStream("emp.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.writeObject(e2);
         oos.writeObject(e3);
          oos.writeObject(e4);
        oos.close();
        fos.close();
        
    }
}
