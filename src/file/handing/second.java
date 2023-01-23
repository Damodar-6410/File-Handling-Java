
package file.handing;

/*import java.io.*;
public class second {
    public static void main(String[] args) {
        File f=new File("alpha.txt");
        String s[]=f.list();
        for(String temp:s)
            System.out.println(temp);
    }
  
}
import java.io.*;
public class second {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\SSI STUDENT\\Desktop\\damodar");
        String s[]=f.list();
        for(String temp:s)
            System.out.println(temp);
    }
  
}*/
import java.io.*;
public class second {
    public static void main(String[] args) {
      File f=new File("alpha.txt");
        // File f=new File("C:\\Users\\SSI STUDENT\\Desktop\\damodar");
        String s[]=f.list();
        if(f.isDirectory()==true)
        {
        for(String temp:s)
            System.out.println(temp);
        }
        else
        {
            System.out.println("is a file or folder not exists");
        }
        }
    }
  
