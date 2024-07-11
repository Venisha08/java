public class Customer {

    int aadharNo,DateOfBirth;
    String name,city;

    //Constructor
     public Customer(String customername,int dob,int id,String cityname){
        name =customername;
        DateOfBirth =dob;
        aadharNo=id;
        city =cityname;
        System.out.println("I am checking constructor calling");
    }
  
    public Customer(int id) {
        //TODO Auto-generated constructor stub
        aadharNo=id;
    }

    public static void main(String[] args) {
         Customer  anbu= new Customer("anbu",8042003, 1234,"Madurai");
         Customer selvam = new Customer(234567);

         //anbu.applyLoan();
         selvam.applyLoan();

    }
    private void applyLoan(){
        System.out.println("customer aadhar number is :"+aadharNo);

    }
}



