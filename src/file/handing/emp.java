
package file.handing;

import java.io.*;
public class emp implements Serializable{
    int empno;
    String name;
    double salary;
    public emp(int eno,String name,double  sal)
    {
        empno=eno;
        this.name=name;
        salary=sal;
    }
}
