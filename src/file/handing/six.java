
package file.handing;

import java.io.*;
public class six {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("Info.txt");
        while(true)
        {
            int val=fis.read();
            if(val==-1)
            {
                break;
            }
            System.out.print((char)val);
        }
    }
}
