package file.handing;

import java.io.*;

public class elevan {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("emp.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        emp e1=(emp)ois.readObject();
          emp e2=(emp)ois.readObject();
          emp e3=(emp)ois.readObject();
            emp e4=(emp)ois.readObject();
          System.out.println("the emp no is "+e1.empno);
           System.out.println("the emp no is "+e1.name);
            System.out.println("the emp no is "+e1.salary);
        fis.close();
        ois.close();
    }
}
