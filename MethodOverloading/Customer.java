package MethodOverloading;

public class Customer {
    public static void main(String[] args)
     {
        Customer Sathish = new Customer();
        Sathish.fillform (" Sathish ",123,"Sathish@gmail.com");
        Customer Selvam = new Customer();
        Selvam.fillform("Selvam",12345,678,"Selvam@gmail.com");
    }
    //polymorphism
    private void fillform(String name,int mob, String mailid)
    {

    }
    //polymorphism
    private void fillform(String name,int mob1,int mob2,String mailid)
    {

    }
    
}
