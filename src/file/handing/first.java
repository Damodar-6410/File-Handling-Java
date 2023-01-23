
package file.handing;
import java.io.*;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a file name");
        String filename=sc.next();
        File f=new File(filename);
        if(f.exists()==true)
        {
            if(f.isFile()==true)
            {
                long val=f.length();
            System.out.println(val);
            }
            else
            {
                System.out.println(filename+" is a folder");
            }
        }
        else
        {
            System.out.println(filename+" not exists");
            
        }
        
    }
    
}
