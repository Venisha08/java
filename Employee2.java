public class Employee2 {
    String name;
    int id;
    <pubic> Employee2(String string,int i )
    {
        this.name = string;
        this .id =  i;
    }
    public static void main(String[] args) {
        String n  = new String("VENISHA");
        System.out.println(n);
        int i =5;
        System.out.println(i);
        /*Arraylist al = new Arraylist();
        al.add("Great");
        System.out.println(al); */
        Employee2 e2 = new Employee2("Raja",123);
        System.out.println(e2);
          
    }
    public String tostring(){
        return name + " " +id;
    }
}
