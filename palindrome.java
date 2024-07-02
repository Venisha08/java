class Palindrome{  
    public static void main(String args[]){  
     int rem,sum=0,temp;    
     int n=459;//It is the number variable to be checked for palindrome  
     
     temp=n;    
     while(n>0){    
      rem=n%10;  //getting remainder  
      sum=(sum*10)+rem;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  