public class NumToWord {
   static void numberToWords(char num[])
     {
        int len = num.length;
        if(len ==0)
        {
            System.out.println("The string is empty");
            return;
        }
        if (len > 4)
        {
            System.out.println("\n The given number has more than 4 digits");
            return ;
        }
        String []onedigits = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String []twodigits = new String[]{"","Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
        String []multipleoftens = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String [] poweroftens = new String[]{ "Hundred","Thousand"};
        System.out.println(String.valueOf(num)+":");
        if(len == 1)
        {
            System.out.println(onedigits [num[0]- '0']);
            return ;

        }
        int x =0 ;
        while (x < num.length)
        {
            if(len >= 3)
            {
                if(num[x]- '0'!=0)
                {
                    System.out.println(onedigits[num[x]- '0']+"");
                    System.out.println(poweroftens[len - 3]+"");
                }
                --len;
            }
            else {
                if(num[x]-'0'==1)
                {
                    int sum = num[x]-'0'+num[x+1] - '0';   
                System.out.println(twodigits[sum]); 
                return ;            }
            }
            else if (num[x]- '0'== 2 && num[x+1]- '0'==0)
            {
                System.out.println("Twenty");
                return ;
            }
            else 
            {
                int i = (num[x]- '0');
                if(i>0)
                System.out.println(multipleoftens[i]+"");
                else 
                System.out.println("");
                ++x;
            }
        }
        public static void main(String args[]);
        {
            numberToWords("1111".toCharArray());
            numberToWords("178".toCharArray());
            numberToWords("561".toCharArray());
            numberToWords("97441".toCharArray());
            numberToWords("8636789".toCharArray());
        }



        }

        }


