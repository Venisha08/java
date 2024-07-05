public class PatternPrgm {
 public static void main(String[] args) {
    for(int row=1;row<=3;row++)
    {

    for(int t1=2;t1>=row;t1++)
    {
        System.out.println( " ");
    }
    for(int t2=1; t2<=3;t2++)
    {
        System.out.println(t2);
    
    for(int t3=row;t3>1;t3--)
    {
        System.out.println(t3-1);
    }
    System.out.println();
 }   

    }
}
}