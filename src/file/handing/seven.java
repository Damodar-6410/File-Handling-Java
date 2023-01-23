
package file.handing;

import java.io.*;
public class seven {
    public static void main(String[] args) throws Exception {
        int x=500;
        double d=35600.32;
        boolean b=true;
        char ch='y';
        FileOutputStream fos=new FileOutputStream("office.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(x);
        dos.writeChar(ch);
        dos.writeBoolean(b);
        dos.writeDouble(d);
        dos.close();
        fos.close();
        System.out.println("file created");
    }
}
