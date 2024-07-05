public class Array {
    public static void main(String[] args) {
        int total =0;
        int []mark = new int[5];
        for (int count =0 ;count <5;count++)
        {
            mark[count]=10;
           
            total =total+mark[count];
        }
        System.out.println(total);
    }
}
