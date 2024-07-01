public class AndOperator {
    public static void main (String args[]){
        int a=10,b=5,c=20;
        System.out.println(a<b && a++ < c);//false &&  11 < 20 true = false
        System.out.println(a); // 10 because second condition is not checked
        System.out.println(a<b & a++ <c);  // false && true = false
        System.out.println(a); //  11 because second conditionis checked 

    }
}
