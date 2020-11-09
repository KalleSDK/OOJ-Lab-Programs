class Emp{
    int eno; static int count;
    Emp(){count++;}
    void seteno(int no){eno = no;}
    static void display()
    {System.out.println("Emp no:" + eno);
     System.out.println("Emp objects create till now: " + count);
} }

public class MainClass 
{ public static void main(String[] args) 
    {   Emp[] employees = new Emp(10);
        for(int i =0;i<employees.length;i++)
        { employees.seteno(i+1); employees.display();}
    
}}
