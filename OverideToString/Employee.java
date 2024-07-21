package OverideToString;

public class Employee 
{
    String name;
    int id;
    public Employee(String String,int i )
    {
    this.name = String;
    this.id =i;
    }
public static void main(String[] args) 
{
    String n = new String("Muthuramalingam");
    System.out.println(n);
    int i =5;
    System.out.println(i);

    Employee e1 = new Employee("Veni",6779);
    System.out.println(e1);

}
/*public String to String()
 {
    return getclass().getname()+"@" + integer.tohexString(hashcode());
 } */
 

 @Override
public String toString() { 
    return name +" "+id;
    
}
}